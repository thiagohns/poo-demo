package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.exception.UserNotFoundException
import demo.exercicio_4.cleanarch.domain.gateway.GetUserByIdGateway
import demo.exercicio_4.cleanarch.domain.model.User
import demo.exercicio_4.repository.UserRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers

@Component
class GetUserByIdH2(
  private val repository: UserRepository
) : GetUserByIdGateway {

  override fun execute(userId: String): Mono<User> {
    return Mono.fromCallable {
      repository.findByUserId(userId)
    }.map<User?> { it!!.toDomain() }
      .doOnError { UserNotFoundException::class.java }
      .subscribeOn(Schedulers.boundedElastic())
  }
}
