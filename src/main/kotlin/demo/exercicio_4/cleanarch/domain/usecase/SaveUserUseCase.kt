package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.GetAddressesDataGateway
import demo.exercicio_4.cleanarch.domain.gateway.SaveAddressesGateway
import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.cleanarch.domain.model.User
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class SaveUserUseCase(
  private val saveUserGateway: SaveUserGateway, // Salvo os dados do user na base
  private val getAddressesDataGateway: GetAddressesDataGateway, // User existente, busca os dados de endereço em uma api externa, pelo cep
  private val saveAddressesGateway: SaveAddressesGateway // salva as infos do endereço na base
) {

  fun execute(user: User): Mono<Void> { //verificar referencia na consumer, como fazemos a relacao dos items na invoice.
    return Mono.just(user)
      .flatMap { saveUserGateway.execute(user) }
      .flatMap { getAddressesDataGateway.execute(user.addressesData.first().zipCode) }
      .flatMap { saveAddressesGateway.execute(it) }
      .then()
  }
}
