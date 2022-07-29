package demo.exercicio_2.factory

import demo.exercicio_2.gateway.GatewayEdicomHTTP
import demo.exercicio_2.gateway.GatewaySIIHTTP
import demo.exercicio_2.gateway.GatewayTralixHTTP
import demo.exercicio_2.gateway.Integrador

abstract class IntegradorFactory {
  companion object {
    fun createIntegrador(type: String): Integrador {
      return when(type) {
        "EDICOM" -> GatewayEdicomHTTP()
        "SII" -> GatewaySIIHTTP()
        "TRALIX" -> GatewayTralixHTTP()
        else -> throw Exception("Invalid invoice type")
      }
    }
  }
}