package exercicio_2

class GatewaySIIHTTP : Integrador {

  override fun enviarParaIntegrador(invoice: Invoice): Invoice {
    // chamada http para sii
    return invoice
  }

}