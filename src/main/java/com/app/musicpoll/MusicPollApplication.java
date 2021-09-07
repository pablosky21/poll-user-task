package com.app.musicpoll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
@SpringBootApplication
@EnableCaching
@EnableAsync
@EnableAutoConfiguration
public class MusicPollApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicPollApplication.class, args);
	}

}
