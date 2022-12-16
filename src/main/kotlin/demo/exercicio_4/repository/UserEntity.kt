package demo.exercicio_4.repository

import demo.exercicio_4.dto.AddressesUser
import demo.exercicio_4.dto.UserDTO
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name ="users")
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
    //  addressesUser = listOf()
    )
}
