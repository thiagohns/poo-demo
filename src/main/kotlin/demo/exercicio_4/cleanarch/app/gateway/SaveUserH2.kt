package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.app.repository.UserRepository
import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.dto.AddressDTO
import demo.exercicio_4.dto.UserDTO
import demo.exercicio_4.repository.AddressesUserEntity
import demo.exercicio_4.repository.UserEntity
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class SaveUserH2(
  private val repository: UserRepository
  ) : SaveUserGateway {

  override fun execute(dto: UserDTO, addressDTO: List<AddressDTO>): UserDTO {
    val userToSave = UserEntity(
      name = dto.name,
      email = dto.email,
      password = dto.password,
      addressesUserEntity = [addressDTO]
    )
    repository.save(userToSave)
  }

}
