package demo.exercicio_2.usecase

import demo.exercicio_2.gateway.Integrador
import demo.exercicio_2.Invoice

// Responsavel por regras de negocio
class AuthorizeInvoice(
  private val integrador: Integrador,
  private val validation: InvoiceValidation
) {

  fun execute(invoice: Invoice): Invoice {
    // validation
    validation.execute(invoice)

    // integration
    integrador.enviarParaIntegrador(invoice)

    // messaging

    // calculation

    // persistence

    TODO()
  }
}