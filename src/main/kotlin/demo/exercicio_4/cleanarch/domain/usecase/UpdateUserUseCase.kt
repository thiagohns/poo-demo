package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.dto.UserDTO
import demo.exercicio_4.repository.UserEntity

class UpdateUserUseCase {

  fun execute(dto: UserDTO) {
    val userToBeUpdated = UserEntity(
      id = dto.id,
      name = dto.name,
      email = dto.email,
      password = dto.password
    )
    repository.save(userToBeUpdated)
  }
}