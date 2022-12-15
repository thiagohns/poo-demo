package demo.exercicio_4.repository

import demo.exercicio_4.cleanarch.domain.model.Address
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user_addresses")
data class AddressEntity(
  val userId: Long,
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
    fun fromDomain(address: Address) = AddressEntity(
      userId = address.userId,
      zipCode = address.zipCode,
      type = address.type,
      number = address.number,
      street = address.street,
      complement = address.complement,
      district = address.district,
      city = address.city,
      state = address.state,
    )
  }

  fun toDomain() = Address(
    userId = userId,
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
