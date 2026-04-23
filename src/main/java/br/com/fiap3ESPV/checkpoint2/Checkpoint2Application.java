package br.com.fiap3ESPV.checkpoint2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Checkpoint2Application {

	public static void main(String[] args) {
		SpringApplication.run(Checkpoint2Application.class, args);
	}

}
