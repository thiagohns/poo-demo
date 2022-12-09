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
  val userId: String,
  var name: String,
  var email: String,
  var password: String,

  ) {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null

  companion object {
    fun fromDomain(user: User) = UserEntity(
      userId = user.userId,
      name = user.name,
      email = user.email,
      password = user.password
    )
  }

  fun toDomain() =
    User(
      userId = userId,
      name = name,
      email = email,
      password = password,
      addressesData = listOf()
    )
}
