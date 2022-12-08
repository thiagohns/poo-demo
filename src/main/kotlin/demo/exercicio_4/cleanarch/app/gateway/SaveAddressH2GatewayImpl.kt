package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.gateway.SaveAddressH2Gateway
import demo.exercicio_4.dto.AddressResponse
import demo.exercicio_4.repository.AddressEntity
import demo.exercicio_4.repository.AddressRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers

@Component
class SaveAddressH2GatewayImpl(
  private val addressRepository: AddressRepository
) : SaveAddressH2Gateway {

  override fun execute(addressResponse: AddressResponse): Mono<AddressResponse> {
    return Mono.fromCallable {
      addressRepository.save(AddressEntity.fromDomain(addressResponse))
    }.map { it.toDomain() }
      .subscribeOn(Schedulers.boundedElastic())
  }
}
