package raisingteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan // spring standard component scan
//spring boot autoconfiguration will bootstrap your Spring
//application while attempting to configure the beans you need
//it will also bootstrap an in-memory database if a driver is found
//in the classpath and no datasource is defined
@EnableAutoConfiguration
@EnableJpaRepositories
public class AppConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(AppConfiguration.class, args);
	}

}
