package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.GetAddressesDataGateway
import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.cleanarch.domain.model.User
import javax.inject.Named

@Named
class SaveUserUseCase(
  private val saveUserGateway: SaveUserGateway,
  private val getAddressesDataGateway: GetAddressesDataGateway,
) {

  fun execute(user: User) {
    user.addressesData
      .map { getAddressesDataGateway.execute(it.zipCode) }
    saveUserGateway.execute(user)
  }
}

//fun execute(user: User): Mono<User> {
//  return Mono.just(user)
//    .flatMap { getAddressesDataGateway.execute() }
//    .map { user }
//    .flatMap { saveUserGateway.execute(user) }
//}
//TODO
// Salvar user + endereco no mesmo momento...
// Como obter todos os endercos do user...