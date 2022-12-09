package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.GetUserByIdGateway
import demo.exercicio_4.cleanarch.domain.model.User
import reactor.core.publisher.Mono
import javax.inject.Named

@Named
class GetUserByIdUseCase(
  private val getUserByIdGateway: GetUserByIdGateway
) {

  fun execute(userId: String): Mono<User> {
    return getUserByIdGateway.execute(userId)
  }

}
