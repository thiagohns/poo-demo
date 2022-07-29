package demo.exercicio_4.repository

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class UserEntity(
  @Id
  val id: String,
  val name: String,
  val email: String,
  val password: String
)
