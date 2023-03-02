package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.app.config.ApiConfig
import demo.exercicio_4.cleanarch.domain.gateway.GetAddressesDataGateway
import demo.exercicio_4.cleanarch.domain.model.AddressResponse
import demo.exercicio_4.cleanarch.domain.model.AddressesUser
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class GetAddressesDataGatewayImpl(
  private val webClient: WebClient, private val apiConfig: ApiConfig
) : GetAddressesDataGateway {

  override fun execute(zipCode: String): Mono<AddressResponse> =
    webClient.get().uri(apiConfig.getInfoAddress) {
        it.build(zipCode)
      }.retrieve()
      .bodyToMono(AddressesUser::class.java)
      .map { it.toDomain() }
}

//TODO
// Usar  RestTemplate, pensar em outra alternativa de como retornar sem o MONO