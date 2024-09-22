package com.demobank.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class DemobankApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemobankApplication.class, args);
	}
}
