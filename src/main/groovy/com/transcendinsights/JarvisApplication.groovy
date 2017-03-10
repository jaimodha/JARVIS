package com.transcendinsights

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer

@SpringBootApplication
@EnableAuthorizationServer
class JarvisApplication {

	static void main(String[] args) {
		SpringApplication.run JarvisApplication, args
	}
}
