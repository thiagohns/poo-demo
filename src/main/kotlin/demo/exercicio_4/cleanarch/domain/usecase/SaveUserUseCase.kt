package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.GetAddressesDataGateway
import demo.exercicio_4.cleanarch.domain.gateway.SaveAddressH2Gateway
import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.dto.AddressResponse
import demo.exercicio_4.dto.AddressesData
import demo.exercicio_4.dto.UserDTO
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class SaveUserUseCase(
  private val saveUserGateway: SaveUserGateway, // Salvo os dados do user na base
  private val getAddressesDataGateway: GetAddressesDataGateway, // User existente, busca os dados de enderço em uma api externa, pelo cep
  private val saveAddressH2Gateway: SaveAddressH2Gateway // salva as infos do endereço na base
) {

  fun execute(userDto: UserDTO): Mono<Void> {
    return Mono.just(userDto)
    .flatMap { saveUserGateway.execute(userDto) }
//      .flatMap { getAddresses(it.addressesData.first()) }
      .flatMap { getAddressesDataGateway.execute(userDto.addressesData.first().zipCode) }
      .flatMap { saveAddressH2Gateway.execute(it) }
      .then()
  }

  private fun getAddresses(
     addressesData: AddressesData,
  ): Mono<AddressResponse> =
    getAddressesDataGateway.execute(addressesData.zipCode)
}

