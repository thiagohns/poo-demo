package demo.exercicio_3

class ValidaEmailLibMicrosoft {

  fun verificaSeEmailEstaCerto(email: String): String {
    if (email == "@") {
      return "1000"
    } else {
      return "2000"
    }
  }

}