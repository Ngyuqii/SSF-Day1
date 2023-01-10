package SSF.Logging;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LoggingApplication {

	private static final Logger logger = LoggerFactory
		.getLogger(LoggingApplication.class);
	private static String portNumber = null;
	private static final String DEFAULT_PORT = "8080";

	public static void main(String[] args) {

		//If an argument is passed
		for (String argVal : args) {
			logger.debug("argVal : " + argVal);
			if (argVal.contains("--port=")) {
				portNumber = argVal.substring(argVal.length() - 4, argVal.length());
				logger.debug("portNumber : " + portNumber);
			}
		}

		//If no "--port=" argument is passed, then portNumber is null
		if (portNumber == null) {
			portNumber = System.getenv("APP_PORT");
			logger.debug("Sys ENV portNumber : " + portNumber);
		}

		//Passing portNumber = System.getenv("APP_PORT"); above gives empty string, portNumber is blank
		if (portNumber == null || portNumber.isBlank()) {
			portNumber = DEFAULT_PORT;
		}

		// Originally SpringApplication.run(LoggingApplication.class, args);
		SpringApplication app = new SpringApplication(LoggingApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", portNumber));
		app.run(args);
	}

}