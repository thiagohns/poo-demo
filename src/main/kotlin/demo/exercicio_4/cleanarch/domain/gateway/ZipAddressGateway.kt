package demo.exercicio_4.cleanarch.domain.gateway

import demo.exercicio_4.dto.ZipAddressesUserDTO
import reactor.core.publisher.Mono

interface ZipAddressGateway {

  fun execute(zip: String): Mono<ZipAddressesUserDTO>
}