package demo.exercicio_2.exception

import demo.exercicio_2.Error

class InvalidInvoiceException(val errors: List<Error?>): RuntimeException()