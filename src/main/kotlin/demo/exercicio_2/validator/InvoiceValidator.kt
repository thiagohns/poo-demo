package demo.exercicio_2.validator

import demo.exercicio_2.Error
import demo.exercicio_2.Invoice

interface InvoiceValidator {

  fun validate(invoice: Invoice): Error?

}
