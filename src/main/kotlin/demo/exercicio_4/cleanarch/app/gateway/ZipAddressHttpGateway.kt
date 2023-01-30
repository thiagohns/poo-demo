package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.app.model.ZipAddressesUser
import demo.exercicio_4.dto.ZipAddressesUserDTO
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

@Component
class ZipAddressHttpGateway(
    val webClient: WebClient
) {
    fun getZipCode(zipCode: String): Mono<ZipAddressesUserDTO> {
        return webClient.get()
            .uri {
                it.path("/$zipCode/json")
                    .build()
            }
            .retrieve()
            .bodyToMono(ZipAddressesUser::class.java)
            .map {
                it.toDomain()
            }
            .onErrorResume {
                Mono.error(it)
            }


    }
}