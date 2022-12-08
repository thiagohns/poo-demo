package demo.exercicio_4.repository

import org.springframework.data.repository.CrudRepository

interface AddressRepository : CrudRepository<AddressEntity, String> {

}

