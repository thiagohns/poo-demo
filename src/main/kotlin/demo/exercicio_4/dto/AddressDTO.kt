package demo.exercicio_4.dto

data class AddressDTO(
  val state: String,
  val type: String,
  val number: String,
  val zip: String,
  val publicPlace: String,
  val district: String,
  val locality: String
)

