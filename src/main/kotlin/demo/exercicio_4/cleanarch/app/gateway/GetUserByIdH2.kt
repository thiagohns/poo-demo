package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.exception.UserNotFoundException
import demo.exercicio_4.cleanarch.domain.gateway.GetUserByIdGateway
import demo.exercicio_4.cleanarch.domain.model.User
import demo.exercicio_4.repository.UserRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class GetUserByIdH2(
  private val repository: UserRepository
) : GetUserByIdGateway {

  override fun execute(id: String): Mono<User> {
    return Mono.fromCallable {
      repository.findById(id)
        .map { it.toDomain() }
        .orElseThrow {
          UserNotFoundException("Registro não encontrado")
        }
    }
  }
}


//override fun execute(id: String): UserDTO {
//  return repository.findById(id)
//    .map {
//      it.toDomain()
//    }.orElseThrow {
//      UserNotFoundException("Registro não encontrado")
//    }
//}
//    return Mono.fromCallable {
//      repository.findForId(id)
//    }.map { it!!.toDomain() }
//      .doOnError { UserNotFoundException::class.java }
//      .subscribeOn(Schedulers.boundedElastic())
//  }

