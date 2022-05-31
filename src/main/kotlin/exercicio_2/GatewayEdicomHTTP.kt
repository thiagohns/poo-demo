package exercicio_2

class GatewayEdicomHTTP : Integrador {

  override fun enviarParaIntegrador(invoice: Invoice): Invoice {
    // chamada http para edicom

    return invoice
  }

}