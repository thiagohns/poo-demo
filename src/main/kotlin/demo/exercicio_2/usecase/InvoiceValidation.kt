package demo.exercicio_2.usecase

import demo.exercicio_2.Invoice
import demo.exercicio_2.exception.InvalidInvoiceException
import demo.exercicio_2.validator.InvoiceValidator

class InvoiceValidation(
  private val validators: List<InvoiceValidator>
) {
  fun execute(invoice: Invoice) {
    val errors = validators.map { it.validate(invoice) }

    if (errors.isNotEmpty()) {
      throw InvalidInvoiceException(errors)
    }
  }
}