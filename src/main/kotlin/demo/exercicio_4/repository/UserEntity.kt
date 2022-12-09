package demo.exercicio_4.repository

import demo.exercicio_4.cleanarch.domain.model.User
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "users")
data class UserEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val userId: String? = null,
  var name: String,
  var email: String,
  var password: String,

  ) {
  @Column(unique = true)
  private var address: Long? = null

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private val addresses: Set<AddressEntity>? = null

  fun user(
    name: String,
    email: String,
    password: String,
    address: Long
  ) {
    this.name = name
    this.email = email
    this.password = password
    this.address = address
  }

  companion object {
    fun fromDomain(userDTO: User) = UserEntity(
      name = userDTO.name,
      email = userDTO.email,
      password = userDTO.password
    )
  }

  fun toDomain() =
    User(
      userId = userId.toString(),
      name = name,
      email = email,
      password = password,
      addressesData = listOf()
    )
}
