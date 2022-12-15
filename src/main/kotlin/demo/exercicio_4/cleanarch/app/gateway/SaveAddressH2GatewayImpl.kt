package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.gateway.SaveAddressesGateway
import demo.exercicio_4.cleanarch.domain.model.Address
import demo.exercicio_4.repository.AddressEntity
import demo.exercicio_4.repository.AddressRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers

@Component
class SaveAddressH2GatewayImpl(
  private val addressRepository: AddressRepository
) : SaveAddressesGateway {

  override fun execute(address: Address): Mono<Address> {
    return Mono.fromCallable {
      addressRepository.save(AddressEntity.fromDomain(address))
    }.map { it.toDomain() }
      .subscribeOn(Schedulers.boundedElastic())
  }
}
