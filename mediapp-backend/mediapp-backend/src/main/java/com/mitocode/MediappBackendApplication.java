package com.mitocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class MediappBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediappBackendApplication.class, args);
	}

		
	@Bean
	public OpenAPI customOpenAPI(){
		return new OpenAPI()
				.info(new Info()
						.title("Spring Boot 3 API MediApp")
						.version("0.0.1")
						.description("Aplicacion Registro Consultas Medicas")
						.termsOfService("http://swagger.io/terms")
						.license(new License().name("Apache 2.0").url("http://springdoc.org"))
						);
	}

}
