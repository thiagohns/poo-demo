package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.ListUsersGateway
import demo.exercicio_4.dto.UserDTO
import org.hibernate.annotations.Comment
import org.springframework.stereotype.Component

@Component
class ListUsersUseCase(private val gateway: ListUsersGateway) {

  fun execute(): List<UserDTO> {
    return gateway.execute()
  }

}
