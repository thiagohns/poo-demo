package demo.exercicio_4.cleanarch.domain.model

data class Address(
  val zipCode: String,
  val type: String,
  val number: String,
  val publicPlace: String,
  val locality: String,
  val district: String,
  val state: String
)
  //  val city: String,
  //  val street: String,
//  val complement: String,
//{
//  companion object {
//    fun toDomain(addressResponse: AddressResponse): Address = Address(
//      zipCode = addressResponse.zipCode,
//      type = addressResponse.,
//      number = addressResponse.,
//      district = addressResponse.district,
//      city = addressResponse.city,
//      state = addressResponse.state
//    )
//  }
//}