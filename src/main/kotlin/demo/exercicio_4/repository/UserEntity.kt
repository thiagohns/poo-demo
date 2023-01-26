package demo.exercicio_4.repository

import demo.exercicio_4.dto.UserDTO
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = "users")
data class UserEntity(
  @Id
  val Id: String,
  val name: String,
  val email: String,
  val password: String
) {

  fun toDomain() =
    UserDTO(
      Id = Id,
      name = name,
      email = email,
      password = password
    )
}
