package demo.exercicio_4.repository

import demo.exercicio_4.dto.UserDTO
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinColumns
import javax.persistence.OneToMany
import javax.persistence.Table


@Entity
@Table(name = "users")
data class UserEntity(
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,
  val name: String,
  val email: String,
  val password: String,
  @OneToMany(mappedBy = "users", cascade = [CascadeType.ALL])
  val addressesUserEntity: List<AddressesUserEntity>
) {

  fun toDomain() =
    UserDTO(
      name = name,
      email = email,
      password = password
    )

}
