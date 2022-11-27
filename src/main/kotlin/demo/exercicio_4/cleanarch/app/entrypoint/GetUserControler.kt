package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.usecase.GetUserByIdUseCase
import demo.exercicio_4.dto.UserDTO
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v2/user")
class GetUserController(
    private val getUserByIdUseCase: GetUserByIdUseCase
) {
    @GetMapping("/{id}", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun getUser(@PathVariable id: String): UserDTO? =
        getUserByIdUseCase.execute(id)
}