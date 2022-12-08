package demo.exercicio_4.repository

import demo.exercicio_4.cleanarch.config.Annotation
import javax.persistence.Embedded

data class UserWithPlaylists(
    @Embedded val user: User,
    @Annotation.Relation(
        parentColumn = "userId",
        entityColumn = "userCreatorId"
    )
    val playlists: List<Playlist>
)


