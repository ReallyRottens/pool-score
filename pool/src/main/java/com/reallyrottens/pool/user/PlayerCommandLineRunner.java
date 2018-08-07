package com.reallyrottens.pool.user;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PlayerCommandLineRunner implements CommandLineRunner {

	private final PlayerRepository repository;
	
	public PlayerCommandLineRunner(PlayerRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... args) throws Exception {
		Stream.of("Pedro", "Ana", "Julieta", "Ricardo", "Maria").forEach(name -> repository.save(new Player(name)));
		repository.findAll().forEach(System.out::println);
	}

}
