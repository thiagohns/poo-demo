package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.model.User
import demo.exercicio_4.cleanarch.domain.usecase.SaveUserUseCase
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("v2/user")
class SaveUserController(
  private val saveUserUseCase: SaveUserUseCase
) {
  @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
  fun saveUser(@RequestBody user: User): Mono<Void> {
    return saveUserUseCase.execute(user)
      .then()
  }
}
