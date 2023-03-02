//package demo.exercicio_4.cleanarch.app.gateway
//
//import demo.exercicio_4.cleanarch.domain.gateway.SaveAddressesGateway
//import demo.exercicio_4.cleanarch.domain.model.Address
//import demo.exercicio_4.repository.AddressEntity
//import demo.exercicio_4.repository.AddressRepository
//import org.springframework.stereotype.Component
//import reactor.core.publisher.Mono
//import reactor.core.scheduler.Schedulers
//
//@Component
//class SaveAddressH2GatewayImpl(
//  private val addressRepository: AddressRepository
//) : SaveAddressesGateway {
//
//  override fun execute(address: Address): Mono<AddressEntity> {
//    return Mono.fromCallable {
//      addressRepository.save(AddressEntity(address))
//    }.map { it.toDomain(address) }
//      .subscribeOn(Schedulers.boundedElastic())
//  }
//}
