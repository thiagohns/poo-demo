package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.GetUserByIdGateway
import demo.exercicio_4.cleanarch.domain.model.User
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import javax.inject.Named

@Component
class GetUserByIdUseCase(
  private val getUserByIdGateway: GetUserByIdGateway
) {

  fun execute(id: String): Mono<User> {
    return getUserByIdGateway.execute(id)
  }

}
