package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.model.User
import demo.exercicio_4.cleanarch.domain.usecase.ListUsersUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v2/user")
class ListarUserController(
    private val listUsersUseCase: ListUsersUseCase
) {
    @GetMapping("/users")
    fun listUsers(): List<User>{
        return listUsersUseCase.execute()
    }
}