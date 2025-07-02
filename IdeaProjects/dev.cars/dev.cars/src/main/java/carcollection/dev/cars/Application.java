package carcollection.dev.cars;

import org.slf4j.ILoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Application {
	//private static final Logger Log = (Logger) Logger.getLogger(String.valueOf(Application.class));

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


}
