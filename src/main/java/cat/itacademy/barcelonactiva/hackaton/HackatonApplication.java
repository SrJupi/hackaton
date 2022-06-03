package cat.itacademy.barcelonactiva.hackaton;

import cat.itacademy.barcelonactiva.hackaton.model.domain.Terraza;
import cat.itacademy.barcelonactiva.hackaton.model.services.TerrazaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class HackatonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackatonApplication.class, args);
	}

}
