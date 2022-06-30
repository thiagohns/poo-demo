package exercicio_2.exception

import exercicio_2.Error

class InvalidInvoiceException(val errors: List<Error?>): RuntimeException()