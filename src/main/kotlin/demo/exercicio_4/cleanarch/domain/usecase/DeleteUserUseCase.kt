package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.cleanarch.domain.gateway.DeleteUserGateway

class DeleteUserUseCase(
  private val getUserByIdUseCase: GetUserByIdUseCase,
  private val deleteUserGateway: DeleteUserGateway
) {

  fun execute(id: String) {
    getUserByIdUseCase.execute(id)
    deleteUserGateway.execute(id)
  }
}