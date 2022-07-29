package demo.exercicio_2

import demo.exercicio_2.usecase.AuthorizeInvoice

class Controller(
  private val authorizeInvoice: AuthorizeInvoice
) {

  fun autorizarInvoice(invoice: InvoiceIn) {
    authorizeInvoice.execute(Invoice.of(invoice))
  }

}

data class InvoiceIn(val type: String, val number: Int) {

}