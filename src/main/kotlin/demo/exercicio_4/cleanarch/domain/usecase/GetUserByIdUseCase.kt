package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.GetUserByIdGateway
import demo.exercicio_4.dto.UserDTO

class GetUserByIdUseCase(private val getUserByIdGateway: GetUserByIdGateway) {

  fun execute(id: String): UserDTO {
    return getUserByIdGateway.execute(id)
  }

}
