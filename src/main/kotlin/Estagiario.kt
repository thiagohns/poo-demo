class Estagiario(id: Long, nome: String) : Funcionario(id, nome), PessoaComAcessoALaboratorio, MantenedorLaboratorio {
  override fun validarAcesso(laboratorio: Laboratorio) {
    TODO("Not yet implemented")
  }

  override fun darManutencao(laboratorio: Laboratorio) {
    TODO("Not yet implemented")
  }
}