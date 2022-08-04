package demo.exercicio_4.cleanarch.domain.usecase

import demo.exercicio_4.dto.UserDTO

class GetUserByIdUseCase {

  fun execute(id: String): UserDTO {
    return repository.findById(id)
      .map {
        UserDTO(
          id = it.id,
          name = it.name,
          email = it.email,
          password = it.password
        )
      }
      .get()
  }

}