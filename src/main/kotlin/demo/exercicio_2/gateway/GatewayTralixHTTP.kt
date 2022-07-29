package demo.exercicio_2.gateway

import demo.exercicio_2.Invoice

class GatewayTralixHTTP: Integrador {

  override fun enviarParaIntegrador(invoice: Invoice): Invoice { // como?

    // chamada http para tralix
    return invoice
  }

}