package demo.exercicio_4.repository

import demo.exercicio_4.cleanarch.domain.model.User
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class UserEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,
  var name: String,
  var email: String,
  var password: String,
  var addresses: List<AddressEntity>
) {

  companion object {
    fun fromDomain(user: User) = UserEntity(
      name = user.name,
      email = user.email,
      password = user.password,
      addresses = user.addressesData. //Falta finalizar para que possa alvar user + addresses
    )
  }

  fun toDomain() =
    User(
      name = name,
      email = email,
      password = password,
      addressesData = addresses
    )
}
