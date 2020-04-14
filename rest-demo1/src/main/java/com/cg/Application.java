package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		/*This single line below does the following;
		 * 1. Create AnnotationConfigApplicationContext.
		 * 2. It uses @ComponentScan for ALL Child packages.
		 * 		2.1 It picks up HelloController class
		 * 		2.2 Does REQUEST MAPPING to "/"
		 * 3. It reads application.properties
		 * 		3.1 Found one property "server.port=3000"
		 * 4. Launches Embedded Tomcat server and deploy HelloController
		 * 5. Wait for you to Terminate the process.
		 */
		SpringApplication.run(Application.class, args);

	}

}
