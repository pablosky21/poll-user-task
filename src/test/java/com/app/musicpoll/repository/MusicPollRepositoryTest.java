package com.app.musicpoll.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.musicpoll.MusicPollApplicationTests;
import com.app.musicpoll.entity.TypeMusic;
import com.app.musicpoll.entity.UserPoll;


public class MusicPollRepositoryTest extends MusicPollApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void testCrearEncuesta() {
		TypeMusic typeMusic = TypeMusic.builder().id(1).descripcion("jazz").build();
		UserPoll userPoll = UserPoll.builder().id(1).mail("pedro@gmail.com").tipoMusica(typeMusic).build();
		UserPoll productoResult = userRepository.save(userPoll);
		assertThat(productoResult).isNotNull();
	}

	@Test
	void testObtenerEncuesta() {
		List<UserPoll> listProductos = userRepository.findAll();
		assertFalse(listProductos.isEmpty());

	}
}
