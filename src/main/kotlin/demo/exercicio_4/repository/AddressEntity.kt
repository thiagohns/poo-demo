package demo.exercicio_4.repository

import demo.exercicio_4.cleanarch.domain.model.AddressResponse
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "addresses")
data class AddressEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,
//  var userId: Long? = null,
  var zipCode: String,
  var street: String,
  var complement: String,
  var district: String,
  var city: String,
  var state: String,

  ) {

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "address_id", nullable = false)
  private var user: UserEntity? = null
  fun address(
//    userId: Long?,
    zipCode: String,
    street: String,
    complement: String,
    district: String,
    city: String,
    state: String,
  ) {
//    this.userId = userId
    this.zipCode = zipCode
    this.street = street
    this.complement = complement
    this.district = district
    this.city = city
    this.state = state
  }

  companion object {
    fun fromDomain(addressResponse: AddressResponse) = AddressEntity(
      zipCode = addressResponse.zipCode,
      street = addressResponse.street,
      complement = addressResponse.complement,
      district = addressResponse.district,
      city = addressResponse.city,
      state = addressResponse.state,
    )
  }

  fun toDomain() = AddressResponse(
    zipCode = zipCode,
    street = street,
    complement = complement,
    district = district,
    city = city,
    state = state
  )
}
