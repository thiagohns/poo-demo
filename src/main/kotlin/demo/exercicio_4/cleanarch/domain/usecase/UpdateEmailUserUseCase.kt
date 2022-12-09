package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.UpdateEmailUserGateway
import demo.exercicio_4.cleanarch.domain.model.User
import javax.inject.Named

@Named
class UpdateEmailUserUseCase (
    private val updateEmailUserGateway: UpdateEmailUserGateway
) {
    fun execute(user: User) {
        updateEmailUserGateway.execute(user.userId, user.email)
    }
}