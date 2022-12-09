package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.model.User
import demo.exercicio_4.cleanarch.domain.usecase.GetUserByIdUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("v2/user")
class GetUserController(
    private val getUserByIdUseCase: GetUserByIdUseCase
) {
    @GetMapping("/{userId}", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun getUser(@PathVariable userId: String): Mono<User> =
        getUserByIdUseCase.execute(userId)
}
