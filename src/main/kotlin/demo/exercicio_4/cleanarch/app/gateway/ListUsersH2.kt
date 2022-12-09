package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.gateway.ListUsersGateway
import demo.exercicio_4.cleanarch.domain.model.User
import demo.exercicio_4.repository.UserRepository
import org.springframework.stereotype.Component

@Component
class ListUsersH2(private val repository: UserRepository): ListUsersGateway {

  override fun execute(): List<User> {
    return repository.findAll()
      .map {
        it.toDomain()
      }
  }

}
