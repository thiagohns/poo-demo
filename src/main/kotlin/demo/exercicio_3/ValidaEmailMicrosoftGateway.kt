package demo.exercicio_3

class ValidaEmailMicrosoftGateway(private val validador: ValidaEmailLibMicrosoft):
  ValidadorDeEmail {

  override fun valida(email: String): Boolean {

    val resultado = validador.verificaSeEmailEstaCerto(email)

    if (resultado == "1000") {
      return true
    } else {
      return false
    }

  }

}