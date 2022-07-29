package demo.exercicio_4.controller

import demo.exercicio_4.dto.UserDTO
import demo.exercicio_4.service.UserService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(private val service: UserService) {

  @GetMapping
  fun get() = service.list()

  @GetMapping("/{id}")
  fun findById(@PathVariable id: String) = service.getById(id)

  @PostMapping
  fun save(@RequestBody userDTO: UserDTO) = service.save(userDTO)

  @PutMapping
  fun update(@RequestBody userDTO: UserDTO) = service.update(userDTO)

  @DeleteMapping("/{id}")
  fun delete(@PathVariable id: String) = service.delete(id)
}