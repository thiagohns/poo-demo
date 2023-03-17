package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.cleanarch.domain.gateway.ZipAddressGateway
import demo.exercicio_4.dto.AddressDTO
import demo.exercicio_4.dto.UserDTO
import demo.exercicio_4.dto.ZipAddressesUserDTO
import org.springframework.stereotype.Component

@Component
class SaveUserUseCase(
  private val saveUserGateway: SaveUserGateway,
  private val zipAddressGateway: ZipAddressGateway
) {

  fun execute(userDto: UserDTO) {
    val resposta = userDto.addressesUser
      .map {
        val zipAddressesUserDTO: ZipAddressesUserDTO? = zipAddressGateway.execute(it.zip)
        val addressDTO = AddressDTO(
          zip = it.zip,
          type = it.type,
          number = it.number,
          publicPlace = zipAddressesUserDTO!!.publicPlace,
          district = zipAddressesUserDTO!!.district,
          locality = zipAddressesUserDTO!!.locality,
          state = zipAddressesUserDTO!!.state
        )
        addressDTO
      }

    saveUserGateway.execute(userDto, resposta)
  }

}
