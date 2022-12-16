package demo.exercicio_4.cleanarch.app.entrypoint

import demo.exercicio_4.cleanarch.domain.usecase.ZipCodeUserCase
import demo.exercicio_4.dto.ZipAddressesUser
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping
class GetZipCodeControle(
    private val zipCodeUserCase: ZipCodeUserCase
)  {
    @GetMapping("/zipcode/{zipCode}", consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun getUser(@PathVariable zipCode: String): Mono<ZipAddressesUser> =
        return zipCodeUserCase.execute(zipCode)
}