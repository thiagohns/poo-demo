package demo.exercicio_4.repository

import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import javax.transaction.Transactional
@Component
interface UserRepository: CrudRepository<UserEntity, String> {

    @Transactional
    @Modifying
    @Query("UPDATE user SET email = :email WHERE id = :id" , nativeQuery = true)
    fun updateEmail(id: String, email: String)
}
