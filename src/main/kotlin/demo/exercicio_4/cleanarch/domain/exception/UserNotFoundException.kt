package demo.exercicio_4.cleanarch.domain.exception

class UserNotFoundException(override val message: String): Exception(message)
