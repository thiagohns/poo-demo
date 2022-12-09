package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.UpdateEmailUserGateway
import demo.exercicio_4.cleanarch.domain.model.User
import org.springframework.stereotype.Component

@Component
class UpdateEmailUserUseCase (
    private val updateEmailUserGateway: UpdateEmailUserGateway
) {
    fun execute(user: User) {
        updateEmailUserGateway.execute(user.userId, user.email)
    }
}