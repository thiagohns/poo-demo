package demo.exercicios

class SistemaAcesso {

  fun liberarAcesso(
    pessoaComAcessoALaboratorio: PessoaComAcessoALaboratorio,
    laboratorio: Laboratorio
  ) {

    val podeAcessar = pessoaComAcessoALaboratorio.validarAcesso(laboratorio)

    if (podeAcessar) {
      // deixa acessar
    } else {
      // não deixa acessar
    }

  }

}