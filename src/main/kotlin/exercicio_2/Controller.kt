package exercicio_2

class Controller(
  private val integrador: Integrador
) {

  fun autorizarInvoice(invoice: Invoice) {
    integrador.enviarParaIntegrador(invoice)
  }

}