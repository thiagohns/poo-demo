package demo.exercicio_2.gateway

import demo.exercicio_2.Invoice

class GatewaySIIHTTP : Integrador {

  override fun enviarParaIntegrador(invoice: Invoice): Invoice {
    // chamada http para sii


    return invoice
  }


  private fun convert(invoice: Invoice) = InvoiceRequestSII(invoice.tipo)

  data class InvoiceRequestSII(val documentType: String, val number: Int? = null)
}

