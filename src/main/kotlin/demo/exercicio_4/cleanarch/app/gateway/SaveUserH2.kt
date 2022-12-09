package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.cleanarch.domain.model.User
import demo.exercicio_4.repository.UserEntity
import demo.exercicio_4.repository.UserRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers

@Component
class SaveUserH2(
  private val repository: UserRepository
) : SaveUserGateway {

  override fun execute(userId: User): Mono<User> {
    return Mono.fromCallable {
      repository.save(UserEntity.fromDomain(userId))
    }.map { it.toDomain() }
      .subscribeOn(Schedulers.boundedElastic())
  }
}
