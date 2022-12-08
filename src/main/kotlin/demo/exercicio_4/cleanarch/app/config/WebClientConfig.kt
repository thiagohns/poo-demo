package demo.exercicio_4.cleanarch.app.config

import com.fasterxml.jackson.databind.ObjectMapper
import io.netty.channel.ChannelOption
import io.netty.handler.timeout.ReadTimeoutHandler
import io.netty.handler.timeout.WriteTimeoutHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.http.client.reactive.ReactorClientHttpConnector
import org.springframework.http.codec.json.Jackson2JsonDecoder
import org.springframework.http.codec.json.Jackson2JsonEncoder
import org.springframework.web.reactive.function.client.ExchangeStrategies
import org.springframework.web.reactive.function.client.WebClient
import reactor.netty.http.client.HttpClient

@Configuration
class WebClientConfig(private val apiConfig: ApiConfig) {

  @Primary
  @Bean
  fun webClientInfo(exchangeStrategies: ExchangeStrategies, httpClient: HttpClient): WebClient =
    WebClient.builder()
      .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
      .baseUrl(apiConfig.getInfoAddress)
      .clientConnector(ReactorClientHttpConnector(httpClient))
      .exchangeStrategies(exchangeStrategies)
      .build()

  @Bean
  fun httpClient(): HttpClient =
    HttpClient
      .create()
      .compress(true)
      .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, TIMEOUT_MILLIS)
      .doOnConnected { conn ->
        conn
          .addHandlerLast(ReadTimeoutHandler(TIMEOUT_SECONDS))
          .addHandlerLast(WriteTimeoutHandler(TIMEOUT_SECONDS))
      }

  @Bean
  fun exchangeStrategies(objectMapper: ObjectMapper): ExchangeStrategies {
    return ExchangeStrategies
      .builder()
      .codecs { clientDefaultCodecsConfig ->
        val codecs = clientDefaultCodecsConfig.defaultCodecs()
        codecs.jackson2JsonEncoder(Jackson2JsonEncoder(objectMapper, MediaType.APPLICATION_JSON))
        codecs.jackson2JsonDecoder(Jackson2JsonDecoder(objectMapper, MediaType.APPLICATION_JSON))
        codecs.maxInMemorySize(KB_1000)
      }.build()
  }

  companion object {
    private const val KB_1000 = 1000
    private const val TIMEOUT_MILLIS = 1000
    private const val TIMEOUT_SECONDS = 10
  }

}
