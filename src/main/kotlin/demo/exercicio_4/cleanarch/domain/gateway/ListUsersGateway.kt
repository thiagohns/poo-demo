package demo.exercicio_4.cleanarch.domain.gateway

import demo.exercicio_4.dto.UserDTO

interface ListUsersGateway {

  fun execute(): List<UserDTO>

}
