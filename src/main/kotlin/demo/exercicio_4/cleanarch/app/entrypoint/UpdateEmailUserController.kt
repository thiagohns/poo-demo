package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.model.User
import demo.exercicio_4.cleanarch.domain.usecase.UpdateEmailUserUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v2/user")
class UpdateEmailUserController(
    private val updateEmailUserUseCase: UpdateEmailUserUseCase
) {
    @PutMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun updateEmail(@RequestBody user: User) =
        updateEmailUserUseCase.execute(user)
}