package demo.exercicio_4.dto


import com.fasterxml.jackson.annotation.JsonProperty


data class ZipAddressesUser(
    @JsonProperty("cep")
    private val zip: String,
    @JsonProperty("logradouro")
    val publicPlace: String,
    @JsonProperty("bairro")
    val district: String,
    @JsonProperty("localidade")
    val locality: String,
    @JsonProperty("uf")
    val state : String
)
