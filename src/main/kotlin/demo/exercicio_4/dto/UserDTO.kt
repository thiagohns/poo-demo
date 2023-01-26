package demo.exercicio_4.dto

data class UserDTO(
  val Id: String,
  val name: String,
  val email: String,
  val password: String,
  val addressesUser: List<AddressesUserDTO>? = listOf()
)
