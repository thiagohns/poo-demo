package demo.exercicio_4.cleanarch.domain.model

import demo.exercicio_4.repository.AddressEntity
//TODO
data class AddressResponse( //Refatorar essa classe para melhorar...
  val zipCode: String,
  val type: String,
  val number: String,
  var street: String,
  var complement: String,
  var district: String,
  var city: String,
  var state: String,
) {
  fun toEntity() =
    AddressEntity(
      zipCode = zipCode,
      type = type,
      number = number,
      street = street,
      complement = complement,
      district = district,
      city = city,
      state = state,
    )
}
