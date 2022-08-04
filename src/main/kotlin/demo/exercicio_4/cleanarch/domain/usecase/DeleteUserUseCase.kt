package demo.exercicio_4.cleanarch.domain.usecase

class DeleteUserUseCase {

  fun execute(id: String) {
    repository.deleteById(id)
  }

}