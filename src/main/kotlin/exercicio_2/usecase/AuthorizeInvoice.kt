package exercicio_2.usecase

import exercicio_2.Integrador
import exercicio_2.Invoice
import exercicio_2.validator.AddressValidator
import exercicio_2.validator.AmountValidator
import exercicio_2.validator.InvoiceValidator
import exercicio_2.validator.IssuerValidator

// Responsavel por regras de negocio
class AuthorizeInvoice(
  private val integrador: Integrador,
  private val validators: List<InvoiceValidator>
) {

  fun execute(invoice: Invoice): Invoice {
    // validation
    validators.forEach {
      val isValid = it.validate(invoice)
      if (!isValid) {
        throw RuntimeException("Invoice não está válida")
      }
    }

    // integration
    integrador.enviarParaIntegrador(invoice)

    // messaging

    // calculation

    // persistence

    TODO()
  }
}