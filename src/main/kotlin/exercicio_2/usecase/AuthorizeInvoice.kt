package exercicio_2.usecase

import exercicio_2.Integrador
import exercicio_2.Invoice
import exercicio_2.validator.AddressValidator
import exercicio_2.validator.AmountValidator
import exercicio_2.validator.IssuerValidator

// Responsavel por regras de negocio
class AuthorizeInvoice(
  private val integrador: Integrador,
  private val amountValidator: AmountValidator,
  private val issuerValidator: IssuerValidator,
  private val addressValidator: AddressValidator
) {

  fun execute(invoice: Invoice): Invoice {
    // validation
    if (!amountValidator.validate(invoice) || !issuerValidator.validate(invoice) || !addressValidator.validate(invoice)) {
      throw Exception("Invalid invoice")
    }

    // integration
    integrador.enviarParaIntegrador(invoice)

    // messaging

    // calculation

    // persistence

    TODO()
  }
}