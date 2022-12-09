package demo.exercicio_4.repository

import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import javax.transaction.Transactional

interface UserRepository : CrudRepository<UserEntity, String> {
  fun findByUserId(UserId: String): UserEntity?

  @Transactional
  @Modifying
  @Query(
    "UPDATE users s SET " +
        "s.email = :email " +
        "WHERE s.id = :id", nativeQuery = true
  )
  fun updateEmail(id: String, email: String)
}