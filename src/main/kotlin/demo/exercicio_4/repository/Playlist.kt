package demo.exercicio_4.repository

import demo.exercicio_4.cleanarch.config.Annotation
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name ="playlist")
data class Playlist(
    @Id
    @Annotation.PrimaryKey
    val playlistId: Long,
    val userCreatorId: Long,
    val playlistName: String
)


