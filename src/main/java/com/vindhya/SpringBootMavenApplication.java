package com.vindhya;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMavenApplication {
	Logger logger = LoggerFactory.getLogger(SpringBootMavenApplication.class);
	@RequestMapping("/")
    String hello() {
		logger.trace("A TRACE Hello World, Spring Boot!");
        logger.debug("A DEBUG Hello World, Spring Boot!");
        logger.info("An INFO Hello World, Spring Boot!");
        logger.warn("A WARN Hello World, Spring Boot!");
        logger.error("An ERROR Hello World, Spring Boot!");
        return "Hello World, Spring Boot Vindhyachal!";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMavenApplication.class, args);
	}

}
