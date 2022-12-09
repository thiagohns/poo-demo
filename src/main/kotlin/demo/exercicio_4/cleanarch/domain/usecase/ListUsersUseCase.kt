package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.ListUsersGateway
import demo.exercicio_4.cleanarch.domain.model.User
import org.springframework.stereotype.Component

@Component
class ListUsersUseCase(
  private val gateway: ListUsersGateway
) {

  fun execute(): List<User> {
    return gateway.execute()
  }

}
