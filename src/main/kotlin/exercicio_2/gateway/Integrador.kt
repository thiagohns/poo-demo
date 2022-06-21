package exercicio_2.gateway

import exercicio_2.Invoice

interface Integrador {
  fun enviarParaIntegrador(invoice: Invoice): Invoice // o que vai ser feito
}