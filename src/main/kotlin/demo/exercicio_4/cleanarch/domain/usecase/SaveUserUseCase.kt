package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.dto.UserDTO
import demo.exercicio_4.repository.UserEntity

class SaveUserUseCase(
  private val saveUserGateway: SaveUserGateway
) {

  fun execute(dto: UserDTO) {
    val userToSave = UserEntity(
      id = dto.id,
      name = dto.name,
      email = dto.email,
      password = dto.password
    )
    repository.save(userToSave)
  }

}
