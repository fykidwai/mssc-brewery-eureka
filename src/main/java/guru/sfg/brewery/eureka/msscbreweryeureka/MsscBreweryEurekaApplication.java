package guru.sfg.brewery.eureka.msscbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MsscBreweryEurekaApplication {

    public static void main(final String[] args) {
        SpringApplication.run(MsscBreweryEurekaApplication.class, args);
    }

}
