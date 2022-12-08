package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.dto.UserDTO
import demo.exercicio_4.repository.UserEntity
import demo.exercicio_4.repository.UserRepository
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers

@Component
class SaveUserH2(
  private val repository: UserRepository
) : SaveUserGateway {

  override fun execute(dto: UserDTO): Mono<UserDTO> {
    return Mono.fromCallable {
      repository.save(UserEntity.fromDomain(dto))
    }.map { it.toDomain() }
      .subscribeOn(Schedulers.boundedElastic())
  }
}
//    val userToSave = UserEntity(
//      userId = dto.userId,
//      name = dto.name,
//      email = dto.email,
//      password = dto.password,
//    )
//    return Mono.just(repository.save(userToSave).toDomain())
//  }

//      addresses = addressResponse.map { it.toEntity() }.toSet()
