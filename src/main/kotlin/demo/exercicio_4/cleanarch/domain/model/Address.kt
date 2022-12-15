package demo.exercicio_4.cleanarch.domain.model

data class Address(
  val userId: Long,
  val zipCode: String,
  val type: String,
  val number: String,
  val street: String,
  val complement: String,
  val district: String,
  val city: String,
  val state: String
) {
  companion object {
    fun toDomain(addressResponse: AddressResponse, userId: Long): Address = Address(
      userId = userId,
      zipCode = addressResponse.zipCode,
      type = addressResponse.type,
      number = addressResponse.number,
      street = addressResponse.street,
      complement = addressResponse.complement,
      district = addressResponse.district,
      city = addressResponse.city,
      state = addressResponse.state
    )
  }
}