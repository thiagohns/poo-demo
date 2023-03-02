package demo.exercicio_4.repository

import demo.exercicio_4.dto.UserDTO
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "users")
data class UserEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY )
  val id: Long? = null,
  val name: String,
  val email: String,
  val password: String
) {

  fun toDomain() =
    UserDTO(
      name = name,
      email = email,
      password = password
    )
}
