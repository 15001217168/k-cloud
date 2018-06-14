package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ClentApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClentApplication.class, args);
	}
}
