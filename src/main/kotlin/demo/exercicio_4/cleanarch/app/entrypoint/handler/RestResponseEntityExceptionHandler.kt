package demo.exercicio_4.cleanarch.app.entrypoint.handler

import demo.exercicio_4.cleanarch.domain.exception.UserNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue.Value

@ControllerAdvice
class RestResponseEntityExceptionHandler {

    @ExceptionHandler(UserNotFoundException::class)
    fun errorException(userNotFoundException: UserNotFoundException): ResponseEntity<String> {
        return ResponseEntity(userNotFoundException.message, HttpStatus.NOT_FOUND)
    }
}