package demo.exercicio_4.cleanarch.domain.exception

class UserNotFoundException(
  override val message: String = "Register not found"
) : Exception(message)
