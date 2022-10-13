package demo.exercicio_4.cleanarch.domain.gateway

interface DeleteUserGateway {

  fun execute(id: String)
}