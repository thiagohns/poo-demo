package demo.exercicio_2.gateway

import demo.exercicio_2.Invoice

interface Integrador {
  fun enviarParaIntegrador(invoice: Invoice): Invoice // o que vai ser feito
}