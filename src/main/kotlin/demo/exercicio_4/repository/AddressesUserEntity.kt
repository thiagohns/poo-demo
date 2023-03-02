package demo.exercicio_4.repository

import demo.exercicio_4.dto.AddressDTO
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "usersAddresses")
data class AddressesUserEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  val id: Long? = null,
  val zip: String,
  val type: String,
  val number: String,
  val publicPlace: String,
  val district: String,
  val locality: String,
  val state: String
) {

  fun toDomain() =
    AddressDTO(
      zip = zip,
      type = type,
      number = number,
      publicPlace = publicPlace,
      district = district,
      locality = locality,
      state = state
    )

  fun fromDomain(addressDTO: AddressDTO) =
    AddressesUserEntity(
      zip = addressDTO.zip,
      type = addressDTO.type,
      number = addressDTO.number,
      publicPlace = addressDTO.publicPlace,
      district = addressDTO.district,
      locality = addressDTO.locality,
      state = addressDTO.state
    )

}

