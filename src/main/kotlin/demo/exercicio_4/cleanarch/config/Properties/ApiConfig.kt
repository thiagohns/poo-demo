package demo.exercicio_4.cleanarch.config.Properties
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "api.external")
class ApiConfig {
    lateinit var getZipCodeAddress: String
    lateinit var uri: String
}