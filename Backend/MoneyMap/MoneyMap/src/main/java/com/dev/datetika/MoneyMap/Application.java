package com.dev.datetika.MoneyMap;

import com.dev.datetika.MoneyMap.servicio.PersonaServicio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import com.dev.datetika.MoneyMap.model.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(PersonaServicio personaServicio) {
		return args -> {
			System.out.println("Inicializando base de datos con H2...");

			personaServicio.guardar(new Persona("Juan", 30));
			personaServicio.guardar(new Persona("Maria", 25));

			System.out.println("Personas guardadas en la base de datos.");
		};
	}
}
