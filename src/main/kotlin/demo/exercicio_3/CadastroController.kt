package demo.exercicio_3

class CadastroController(
  private val validadorDeEmail: ValidadorDeEmail
) {


  fun cadastrar(requisicao: String) {

    val resultado = validadorDeEmail.valida(requisicao)

    if (resultado == true) {
      // cadastra
    }

  }

}