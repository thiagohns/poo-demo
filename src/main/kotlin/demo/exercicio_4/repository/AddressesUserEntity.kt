package demo.exercicio_4.repository

import demo.exercicio_4.dto.AddressDTO
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "usersAddresses")
data class AddressesUserEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  private val id: Long? = null,
  private val zip: String,
  private val type: String,
  private val number: String,
  private val publicPlace: String,
  private val district: String,
  private val locality: String,
  private val state: String,
  val idUser: Long
) {

  fun toDomain() =
    AddressDTO(
      zip = zip,
      type = type,
      number = number,
      publicPlace = publicPlace,
      district = district,
      locality = locality,
      state = state,
      idUser = idUser
    )

  fun fromDomain(addressDTO: AddressDTO) =
    AddressesUserEntity(
      zip = addressDTO.zip,
      type = addressDTO.type,
      number = addressDTO.number,
      publicPlace = addressDTO.publicPlace,
      district = addressDTO.district,
      locality = addressDTO.locality,
      state = addressDTO.state,
      idUser = addressDTO.idUser
    )
}

