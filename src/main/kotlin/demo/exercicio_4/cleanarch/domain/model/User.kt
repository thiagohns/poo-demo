package demo.exercicio_4.cleanarch.domain.model

data class User(
  val userId: Long,
  val name: String,
  val email: String,
  val password: String,
  val addressesData: List<AddressesData> = mutableListOf()
)
