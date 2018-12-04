package ftn.NaucnaCentrala.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import ftn.NaucnaCentrala.app.Application;

@SpringBootApplication
@ComponentScan(basePackageClasses = Application.class)
@EnableJpaRepositories
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
