package demo.exercicio_4.cleanarch.domain.gateway

import demo.exercicio_4.dto.AddressDTO
import demo.exercicio_4.dto.UserDTO

interface SaveUserGateway {

  fun execute(userDTO: UserDTO, addressDTO: List<AddressDTO>): UserDTO
}
