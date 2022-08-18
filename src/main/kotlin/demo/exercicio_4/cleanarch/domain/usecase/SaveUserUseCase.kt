package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.dto.UserDTO

class SaveUserUseCase(
  private val saveUserGateway: SaveUserGateway
) {

  fun execute(userDto: UserDTO) {
    saveUserGateway.execute(userDto)
  }

}
