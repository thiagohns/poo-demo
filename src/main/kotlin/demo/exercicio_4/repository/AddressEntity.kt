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
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,
  val zipCode: String,
  val type: String,
  val number: String,
  val publicPlace: String,
  var district: String,
  val locality: String,
  var state: String
  //  var street: String,
//  var complement: String,
  //  var city: String,
) {

  fun toDomain(address: Address) = AddressEntity(
    zipCode = address.zipCode,
    type = address.type,
    number = address.number,
    publicPlace = address.publicPlace,
    district = address.district,
    state = address.state,
    locality = address.locality,
  )


  fun fromDomain() = AddressEntity(
    zipCode = zipCode,
    type = type,
    number = number,
    publicPlace = publicPlace,
    district = district,
    state = state,
    locality = locality
  )

}
