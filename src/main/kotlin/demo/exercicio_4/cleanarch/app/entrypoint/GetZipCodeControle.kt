package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.usecase.ZipCodeUserCase
import demo.exercicio_4.dto.ZipAddressesUserDTO
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("v2/user")
class GetZipCodeControle(
  private val zipCodeUserCase: ZipCodeUserCase
) {
  @GetMapping("/zipcode/{zipcode}")
  fun getZipCode(@PathVariable zipcode: String): Mono<ZipAddressesUserDTO> {
    return zipCodeUserCase.execute(zipcode)
  }
}