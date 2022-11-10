package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.usecase.DeleteUserUseCase
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("v2/user")
class DeleteUserController(
    private val deleteUserUseCase: DeleteUserUseCase
) {
    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: String){
        deleteUserUseCase.execute(id)
    }
}