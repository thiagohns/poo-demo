package demo.exercicio_4.cleanarch.app.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "api.external")
class ApiConfig {
  lateinit var getInfoAddress: String
}
