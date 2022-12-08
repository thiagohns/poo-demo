package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.UpdateEmailUserGateway
import demo.exercicio_4.dto.UserDTO
import org.springframework.stereotype.Component

@Component
class UpdateEmailUserUseCase (
    private val updateEmailUserGateway: UpdateEmailUserGateway
) {
    fun execute(userDto: UserDTO) {
        updateEmailUserGateway.execute(userDto.userId, userDto.email)
    }
}