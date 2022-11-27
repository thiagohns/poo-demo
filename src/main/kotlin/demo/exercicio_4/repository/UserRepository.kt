package demo.exercicio_4.cleanarch.app.repository

import demo.exercicio_4.repository.UserEntity
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import javax.transaction.Transactional

interface UserRepository : CrudRepository<UserEntity, String> {

    @Transactional
    @Modifying
    @Query(
        "UPDATE users s SET " +
                "s.email = :email " +
                "WHERE s.id = :id", nativeQuery = true
    )
    fun updateEmail(id: String, email: String)
}