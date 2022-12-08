package demo.exercicio_4.cleanarch.app.gateway

import org.springframework.web.reactive.function.client.WebClient


class WebClienteGateway (
    private val webClient : WebClient
    ) {

}