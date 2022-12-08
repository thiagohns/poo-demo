package demo.exercicio_4.cleanarch.domain.gateway

import demo.exercicio_4.dto.AddressResponse
import reactor.core.publisher.Mono

interface GetAddressesDataGateway {

  fun execute(zipCode: String): Mono<AddressResponse>
}
