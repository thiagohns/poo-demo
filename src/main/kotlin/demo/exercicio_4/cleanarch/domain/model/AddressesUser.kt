package demo.exercicio_4.cleanarch.domain.model

import com.fasterxml.jackson.annotation.JsonProperty

data class AddressesUser(
  @JsonProperty("cep")
  val zip: String,
  @JsonProperty("logradouro")
  val publicPlace: String,
  @JsonProperty("bairro")
  val district: String,
  @JsonProperty("localidade")
  val locality: String,
  @JsonProperty("uf")
  val state: String
) {
  fun toDomain() =
    AddressResponse(
      zipCode = zip,
      publicPlace = publicPlace,
      district = district,
      locality = locality,
      state = state
    )
}
