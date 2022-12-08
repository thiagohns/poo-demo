package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.dto.UserDTO
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
@Component
class UpdateUserUseCase(
  private val saveUserGateway: SaveUserGateway
) {

  fun execute(userDto: UserDTO): Mono<UserDTO> {
    return saveUserGateway.execute(userDto)
  }

}

//  fun execute(userDto: UserDTO, addressResponse: List<AddressResponse>): Mono<UserDTO> {
//    return saveUserGateway.execute(userDto, addressResponse)
//  }