package exercicio_2.validator

import exercicio_2.Error
import exercicio_2.Invoice

interface InvoiceValidator {

  fun validate(invoice: Invoice): Error?

}
