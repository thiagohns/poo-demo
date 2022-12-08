package demo.exercicio_4.dto

data class UserDTO(
  val userId: String,
  val name: String,
  val email: String,
  val password: String,
  val addressesData: List<AddressesData> //= mutableListOf()
)
