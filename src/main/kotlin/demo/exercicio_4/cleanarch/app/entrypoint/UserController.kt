package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.usecase.SaveUserUseCase
import demo.exercicio_4.dto.UserDTO
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(
    private val saveUserUseCase: SaveUserUseCase
) {
    @PostMapping()
    fun saveUser(userDTO: UserDTO){
        saveUserUseCase.execute(userDTO)
    }
}