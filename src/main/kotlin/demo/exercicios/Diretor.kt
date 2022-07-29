package demo.exercicios

class Diretor(id: Long, nome: String) : Funcionario(id, nome) {

  override fun validarAcesso(laboratorio: Laboratorio): Boolean {
    return true
  }
}