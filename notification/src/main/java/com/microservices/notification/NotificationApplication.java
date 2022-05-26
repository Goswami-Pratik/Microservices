package com.microservices.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(
        scanBasePackages = {
                "com.microservices.notification",
                "com.microservices.amqp"
        }
)
public class NotificationApplication {
    public static void main(String[] args) {SpringApplication.run(NotificationApplication.class, args);}
}
