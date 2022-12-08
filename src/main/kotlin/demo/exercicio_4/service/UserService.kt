//package demo.exercicio_4.service
//
//import demo.exercicio_4.dto.UserDTO
//import demo.exercicio_4.repository.UserEntity
//import demo.exercicio_4.repository.UserRepository
//import org.springframework.stereotype.Component
//
//@Component
//class UserService(private val repository: UserRepository) {
//
//  fun list(): List<UserDTO> {
//    return repository.findAll()
//      .map {
//        UserDTO(
//          userId = it.userId,
//          name = it.name,
//          email = it.email,
//          password = it.password,
//        )
//      }
//  }
//
//  fun save(dto: UserDTO) {
//    val userToSave = UserEntity(
//      userId = dto.userId,
//      name = dto.name,
//      email = dto.email,
//      password = dto.password
//    )
//    repository.save(userToSave)
//  }
//
//  fun update(dto: UserDTO) {
//    val userToBeUpdated = UserEntity(
//      userId = dto.userId,
//      name = dto.name,
//      email = dto.email,
//      password = dto.password
//    )
//    repository.save(userToBeUpdated)
//  }
//
//  fun getById(id: String): UserDTO {
//    return repository.findById(id)
//      .map {
//        UserDTO(
//          userId = it.userId,
//          name = it.name,
//          email = it.email,
//          password = it.password
//        )
//      }
//      .get()
//  }
//
//  fun delete(id: String) {
//    repository.deleteById(id)
//  }
//}