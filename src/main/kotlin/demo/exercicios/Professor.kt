package demo.exercicios

class Professor(id: Long, nome: String) : Funcionario(id, nome) {

  override fun validarAcesso(laboratorio: Laboratorio): Boolean {
    // pega lista de materias que ele tem acesso
    // compara se laboratorio pertence as materias que ele leciona
    return true
  }

}