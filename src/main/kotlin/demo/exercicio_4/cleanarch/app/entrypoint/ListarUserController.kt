package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.usecase.ListUsersUseCase
import demo.exercicio_4.dto.UserDTO
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("v2/user")
class ListarUserController(
    private val listUsersUseCase: ListUsersUseCase
) {
    @GetMapping("/users")
    fun listUsers(): List<UserDTO>{
        return listUsersUseCase.execute()
    }
}