package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.dto.UserDTO

class ListUsersUseCase {

  fun execute(): List<UserDTO> {
    return repository.findAll()
      .map {
        UserDTO(
          id = it.id,
          name = it.name,
          email = it.email,
          password = it.password
        )
      }
  }

}
