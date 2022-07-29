package demo.exercicio_2

data class Invoice(
  val tipo: String,
  val enderecoEntrega: String,
  val items: List<Item>
) {
  companion object {
    fun of(invoiceIn: InvoiceIn): Invoice {
      TODO()
    }
  }
}

data class Item(
  val id: Long,
  val description: String
)