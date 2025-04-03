package br.com.diogow.projeto_rocketseat_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = "br.com.diogow")
public class ProjetoRocketseatSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoRocketseatSpringbootApplication.class, args);
	}

}