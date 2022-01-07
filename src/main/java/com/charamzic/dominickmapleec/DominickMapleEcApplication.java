package com.charamzic.dominickmapleec;

import com.charamzic.dominickmapleec.models.Subscriber;
import com.charamzic.dominickmapleec.services.SubscriberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DominickMapleEcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DominickMapleEcApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(SubscriberService service) {
        return args -> {
            service.save(new Subscriber("First One", "first@one.cz"));
            service.save(new Subscriber("Second One", "second@one.cz"));
        };
    }
}