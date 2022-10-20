package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.UpdateEmailUserGateway
import demo.exercicio_4.dto.UserDTO

class UpdateEmailUserUseCase (
    private val updateEmailUserGateway: UpdateEmailUserGateway
) {
    fun execute(userDto: UserDTO) {
        updateEmailUserGateway.execute(userDto.id, userDto.email)
    }
}