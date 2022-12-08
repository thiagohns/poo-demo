package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.GetUserByIdGateway
import demo.exercicio_4.dto.UserDTO
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class GetUserByIdUseCase(
  private val getUserByIdGateway: GetUserByIdGateway
) {

  fun execute(userId: String): Mono<UserDTO> {
    return getUserByIdGateway.execute(userId)
  }

}
