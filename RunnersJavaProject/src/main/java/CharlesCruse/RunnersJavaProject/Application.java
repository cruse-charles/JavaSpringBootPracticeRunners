package CharlesCruse.RunnersJavaProject;

import CharlesCruse.RunnersJavaProject.run.Location;
import CharlesCruse.RunnersJavaProject.run.Run;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "Morning Run", Location.OUTDOOR, LocalDateTime.now(), LocalDateTime.now().plusHours(1), 5);
			log.info("Run: " + run);
		};
	}
}
