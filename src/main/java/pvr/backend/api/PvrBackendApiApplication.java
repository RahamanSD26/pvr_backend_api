package pvr.backend.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class PvrBackendApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PvrBackendApiApplication.class, args);
	}

}
