package demo.exercicio_4.dto

data class UserDTO(
  val name: String,
  val email: String,
  val password: String,
  val addressesUser: List<AddressesUserDTO> = listOf()
)
