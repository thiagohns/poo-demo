package demo.exercicio_3

class ValidaEmailLibGoogle {


  fun validaEmail(email: String): String {
    if (email == "@") {
      return "yes"
    } else {
      return "no"
    }
  }


}