package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.cleanarch.domain.model.User
import reactor.core.publisher.Mono
import javax.inject.Named

@Named
class UpdateUserUseCase(
  private val saveUserGateway: SaveUserGateway
) {

  fun execute(user: User): Mono<User> {
    return saveUserGateway.execute(user)
  }

}
