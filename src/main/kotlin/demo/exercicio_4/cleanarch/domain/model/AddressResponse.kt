package demo.exercicio_4.cleanarch.domain.model

data class AddressResponse(
  val zipCode: String,
  val type: String,
  val number: String,
  var street: String,
  var complement: String,
  var district: String,
  var city: String,
  var state: String,
)
