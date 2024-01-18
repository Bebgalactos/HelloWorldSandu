package fr.ul.miage.beb;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class HWServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HWServiceApplication.class, args);
	}

	@Bean
	public OpenAPI intervenantAPI() {
		return new OpenAPI().info(new Info()
				.title("HelloWorld API")
				.version("1.0")
				.description("Documentation HelloWorld API v1.0"));
	}

}
