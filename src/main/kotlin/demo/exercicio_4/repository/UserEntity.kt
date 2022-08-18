package demo.exercicio_4.repository

import demo.exercicio_4.dto.UserDTO
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserEntity(
  @Id
  val id: String,
  val name: String,
  val email: String,
  val password: String
) {

  fun toDomain() =
    UserDTO(
      id = id,
      name = name,
      email = email,
      password = password
    )

}
