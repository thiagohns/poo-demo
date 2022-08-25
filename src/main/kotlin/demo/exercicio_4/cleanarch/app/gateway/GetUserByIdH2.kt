package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.exception.UserNotFoundException
import demo.exercicio_4.cleanarch.domain.gateway.GetUserByIdGateway
import demo.exercicio_4.dto.UserDTO
import demo.exercicio_4.repository.UserRepository

class GetUserByIdH2(private val repository: UserRepository): GetUserByIdGateway {

  override fun execute(id: String): UserDTO {
    return repository.findById(id)
      .map {
        it.toDomain()
      }.orElseThrow {
        UserNotFoundException("Registro não encontrado")
      }
  }

}
