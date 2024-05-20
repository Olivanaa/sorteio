package br.com.fiap.sorteio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
	info = @Info(
		title = "Sorteio",
		version = "1.0"
	)
)
public class SorteioApplication {

	public static void main(String[] args) {
		SpringApplication.run(SorteioApplication.class, args);
	}

}
