package exercicio_2.validator

import exercicio_2.Invoice

interface InvoiceValidator {

  fun validate(invoice: Invoice) : Boolean // o que tem que ser feito e não como

}
