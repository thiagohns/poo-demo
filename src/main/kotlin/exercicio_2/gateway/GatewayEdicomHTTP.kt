package exercicio_2.gateway

import exercicio_2.Invoice

class GatewayEdicomHTTP : Integrador {

  override fun enviarParaIntegrador(invoice: Invoice): Invoice {
    // chamada http para edicom

    return invoice
  }

}