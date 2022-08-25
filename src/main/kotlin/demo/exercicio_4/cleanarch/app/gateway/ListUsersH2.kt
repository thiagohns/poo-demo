package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.gateway.ListUsersGateway
import demo.exercicio_4.dto.UserDTO
import demo.exercicio_4.repository.UserRepository

class ListUsersH2(private val repository: UserRepository): ListUsersGateway {

  override fun execute(): List<UserDTO> {
    return repository.findAll()
      .map {
        it.toDomain()
      }
  }

}
