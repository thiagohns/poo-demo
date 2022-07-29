package demo.exercicio_3

class ValidaEmailGoogleGateway(private val validador: ValidaEmailLibGoogle) : ValidadorDeEmail {

  override fun valida(email: String): Boolean {

    val resultado = validador.validaEmail(email)

    if (resultado == "yes") {
      return true
    } else {
      return false
    }

  }

}