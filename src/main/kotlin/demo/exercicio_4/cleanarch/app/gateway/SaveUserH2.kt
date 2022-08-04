package demo.exercicio_4.cleanarch.app.gateway

import demo.exercicio_4.cleanarch.domain.gateway.SaveUserGateway
import demo.exercicio_4.repository.UserRepository

class SaveUserH2(private val repository: UserRepository) : SaveUserGateway {

  override fun execute() {
    TODO("Not yet implemented")
  }

}
