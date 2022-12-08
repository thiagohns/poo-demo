package demo.exercicio_4.cleanarch.domain.gateway

import demo.exercicio_4.dto.AddressResponse
import demo.exercicio_4.repository.AddressEntity
import reactor.core.publisher.Mono

interface SaveAddressH2Gateway {

  fun execute(addressResponse: AddressResponse): Mono<AddressResponse>
}
