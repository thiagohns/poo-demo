package demo.exercicio_4.repository

import demo.exercicio_4.cleanarch.config.Annotation
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name ="user")
data class User (
    @Id
    @Annotation.PrimaryKey val userId: Long,
    val name: String,
    val age: Int
    )