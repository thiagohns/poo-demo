package demo.exercicio_2.validator

import demo.exercicio_2.Error
import demo.exercicio_2.Invoice

//@Component
class ShipmentValidator : InvoiceValidator {
  override fun validate(invoice: Invoice): Error? {
    TODO()
  }
}