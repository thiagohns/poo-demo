package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.ListUsersGateway
import demo.exercicio_4.cleanarch.domain.model.User
import javax.inject.Named

@Named
class ListUsersUseCase(
  private val gateway: ListUsersGateway
) {

  fun execute(): List<User> {
    return gateway.execute()
  }

}
