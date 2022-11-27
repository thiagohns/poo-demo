package demo.exercicio_4.cleanarch.app.gateway


import demo.exercicio_4.cleanarch.app.repository.UserRepository
import demo.exercicio_4.cleanarch.domain.gateway.UpdateEmailUserGateway

class UpdateEmailUserH2(
    private val repository: UserRepository
) : UpdateEmailUserGateway {
    override fun execute(id: String, email: String) {
        repository.updateEmail(id, email)
    }
}