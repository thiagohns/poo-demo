package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.gateway.DeleteUserGateway
import demo.exercicio_4.repository.UserRepository

class DeleteUserH2 (private val repository: UserRepository): DeleteUserGateway {
  override fun execute(id: String) {
    repository.deleteById(id)
  }
}