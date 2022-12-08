//package demo.exercicio_4.dto
//
//import demo.exercicio_4.dto.Annotation.Relation
//import javax.persistence.Embedded
//
//
//data class UserWithAddressesLists(
//  @Embedded val userDTO: UserDTO,
//  @Relation(
//    parentColumn = "userId",
//    entityColumn = "userId"
//  )
//  val addressesData: List<AddressesData>
//)