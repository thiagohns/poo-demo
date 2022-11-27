package demo.exercicio_4.cleanarch.domain.gateway

interface UpdateEmailUserGateway  {

    fun execute(id: String, email: String)
}