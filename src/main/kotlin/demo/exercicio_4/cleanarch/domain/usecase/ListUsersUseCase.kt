package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.ListUsersGateway
import demo.exercicio_4.dto.UserDTO

class ListUsersUseCase(private val gateway: ListUsersGateway) {

  fun execute(): List<UserDTO> {
    return gateway.execute()
  }

}
