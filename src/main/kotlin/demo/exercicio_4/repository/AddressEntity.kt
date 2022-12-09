package demo.exercicio_4.repository

import demo.exercicio_4.cleanarch.domain.model.AddressResponse
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user_addresses")
data class AddressEntity(
  val zipCode: String,
  val type: String,
  val number: String,
  var street: String,
  var complement: String,
  var district: String,
  var city: String,
  var state: String,
  ) {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null

  companion object {
    fun fromDomain(addressResponse: AddressResponse) = AddressEntity(
      zipCode = addressResponse.zipCode,
      type = addressResponse.type,
      number = addressResponse.number,
      street = addressResponse.street,
      complement = addressResponse.complement,
      district = addressResponse.district,
      city = addressResponse.city,
      state = addressResponse.state,
    )
  }

  fun toDomain() = AddressResponse(
    zipCode = zipCode,
    type = type,
    number = number,
    street = street,
    complement = complement,
    district = district,
    city = city,
    state = state
  )
}
