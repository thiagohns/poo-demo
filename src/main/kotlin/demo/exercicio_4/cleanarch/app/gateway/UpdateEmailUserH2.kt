package demo.exercicio_4.cleanarch.app.gateway


import demo.exercicio_4.cleanarch.domain.gateway.UpdateEmailUserGateway
import demo.exercicio_4.repository.UserRepository

class UpdateEmailUserH2(private val repository: UserRepository) : UpdateEmailUserGateway {
    override fun execute(id: String, email: String) {
        repository.updateEmail(id, email)
    }
}