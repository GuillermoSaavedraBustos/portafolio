package es.capitole.portafolio.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "es.capitole.portafolio.repository")
public class JpaConfiguration {
   
}
