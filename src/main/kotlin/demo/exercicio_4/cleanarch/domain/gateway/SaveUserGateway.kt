package demo.exercicio_4.cleanarch.domain.gateway

import demo.exercicio_4.cleanarch.domain.model.User
import reactor.core.publisher.Mono

interface SaveUserGateway {

  fun execute(user: User): Mono<User>
}
