package exercicio_2

data class Invoice(
  val tipo: String,
  val enderecoEntrega: String
) {
  companion object {
    fun of(invoiceIn: InvoiceIn): Invoice {
      TODO()
    }
  }
}