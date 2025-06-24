package carcollection.dev.cars;

import org.slf4j.LoggerFactory; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import client.Collection;
import run.car;

@SpringBootApplication
public class Application {

	private static final Logger Log = (Logger) LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Log.info("welocme to the web!!");
		
		
	}

}
