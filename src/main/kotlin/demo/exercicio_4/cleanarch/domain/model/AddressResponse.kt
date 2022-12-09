package demo.exercicio_4.cleanarch.domain.model

import demo.exercicio_4.repository.AddressEntity

data class AddressResponse( // Melhorar ????
  val zipCode: String,
  val street: String,
  val complement: String,
  val district: String,
  val city: String,
  val state: String,
) {
  fun toEntity() =
    AddressEntity(
      zipCode = zipCode,
      street = street,
      complement = complement,
      district = district,
      city = city,
      state = state,
    )
}
