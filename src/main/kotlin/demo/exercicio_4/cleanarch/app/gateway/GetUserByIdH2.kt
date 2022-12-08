package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.repository.UserRepository
import demo.exercicio_4.cleanarch.domain.exception.UserNotFoundException
import demo.exercicio_4.cleanarch.domain.gateway.GetUserByIdGateway
import demo.exercicio_4.dto.UserDTO
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers

@Component
class GetUserByIdH2(
  private val repository: UserRepository
) : GetUserByIdGateway {

  override fun execute(userId: String): Mono<UserDTO> {
    return Mono.fromCallable {
      repository.findByUserId(userId)
    }.map { it!!.toDomain() }
      .doOnError { UserNotFoundException::class.java }
      .subscribeOn(Schedulers.boundedElastic())
  }
}


//        UserNotFoundException("Registro não encontrado")
//    .subscribeOn(Schedulers.boundedElastic())
//      .map {
//        it.toDomain()
//      }.orElseThrow {
//        UserNotFoundException("Registro não encontrado")
//      }

// override fun execute(documentId: Long, ignoreEmptyResult: Boolean): Mono<Document> {
//    return Mono.fromCallable {
//      documentRepository.findByDocumentId(documentId)
//    }
//      .map { it.toDomain() }
//      .onErrorResume(EmptyResultDataAccessException::class.java) {
//        if(ignoreEmptyResult) {
//          Mono.empty()
//        } else
//          Mono.error(it)
//        }
//      .subscribeOn(Schedulers.boundedElastic())
//  }

//  override fun execute(invoiceId: Long): Mono<Invoice> =
//    Mono.fromCallable {
//      invoiceRepository.findByInvoiceId(invoiceId)
//    }.flatMap {
//      if (it == null) Mono.empty()
//      else Mono.just(it.toDomain())
//    }.subscribeOn(Schedulers.boundedElastic())
//}