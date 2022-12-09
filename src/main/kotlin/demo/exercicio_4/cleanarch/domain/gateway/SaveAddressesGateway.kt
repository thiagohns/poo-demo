package demo.exercicio_4.cleanarch.domain.gateway

import demo.exercicio_4.cleanarch.domain.model.AddressResponse
import reactor.core.publisher.Mono

interface SaveAddressesGateway {

  fun execute(addressResponse: AddressResponse): Mono<AddressResponse>
}
