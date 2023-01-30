package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.app.gateway.ZipAddressHttpGateway
import demo.exercicio_4.dto.ZipAddressesUserDTO
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono

@Component
class ZipCodeUserCase(
  private val zipAddressHttpGateway: ZipAddressHttpGateway
) {

  fun execute(zipcode: String): Mono<ZipAddressesUserDTO> {
      return zipAddressHttpGateway.getZipCode(zipcode)
  }
}