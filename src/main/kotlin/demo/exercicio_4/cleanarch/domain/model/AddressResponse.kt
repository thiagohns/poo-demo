package demo.exercicio_4.cleanarch.domain.model

data class AddressResponse(
  val zipCode: String,
  val publicPlace: String,
  val district: String,
  val locality: String,
  val state: String
)
//  val zipCode: String,
//  var street: String,
//  var complement: String,
//  var district: String,
//  var city: String,
//  var state: String,
