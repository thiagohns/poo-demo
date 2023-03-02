package demo.exercicio_4.cleanarch.domain.gateway

import demo.exercicio_4.cleanarch.domain.model.Address
import demo.exercicio_4.repository.AddressEntity
import reactor.core.publisher.Mono

interface SaveAddressesGateway {

  fun execute(address: Address): Mono<AddressEntity>
}
