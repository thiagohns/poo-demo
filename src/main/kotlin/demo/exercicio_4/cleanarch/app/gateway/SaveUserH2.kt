package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.app.repository.UserRepository
import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.dto.UserDTO
import demo.exercicio_4.repository.UserEntity
import org.springframework.stereotype.Component

@Component
class SaveUserH2(private val repository: UserRepository) : SaveUserGateway {

  override fun execute(dto: UserDTO) {
    val userToSave = UserEntity(
      Id = dto.Id,
      name = dto.name,
      email = dto.email,
      password = dto.password
    )
    repository.save(userToSave)
  }

}
