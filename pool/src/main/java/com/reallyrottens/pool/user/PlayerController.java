package com.reallyrottens.pool.user;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

	private PlayerRepository repository;

	public PlayerController(PlayerRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/good-players")
	Collection<Player> list() {
		return repository.findAll();
	}
}
