package demo.exercicio_4.cleanarch.app.model


import com.fasterxml.jackson.annotation.JsonProperty
import demo.exercicio_4.dto.ZipAddressesUserDTO


data class ZipAddressesUser(
    @JsonProperty("cep")
    val zip: String,
    @JsonProperty("logradouro")
    val publicPlace: String,
    @JsonProperty("bairro")
    val district: String,
    @JsonProperty("localidade")
    val locality: String,
    @JsonProperty("uf")
    val state : String
){
    fun toDomain() =
        ZipAddressesUserDTO(
            zip = zip,
            publicPlace = publicPlace,
            district = district,
            locality = locality,
            state = state
        )
}
