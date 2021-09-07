package com.app.musicpoll.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.app.musicpoll.dto.UserDto;
import com.app.musicpoll.entity.TypeMusic;
import com.app.musicpoll.entity.UserPoll;
import com.app.musicpoll.repository.UserRepository;

@SpringBootTest
public class MusicPollServicesTest {

	@Autowired
	MusicPollServices musicPollServices;

	@MockBean
	UserRepository userRepository;

	@Test
	void testObtenerEncuesta() {
		UserPoll userPoll = UserPoll.builder().mail("mail 1").tipoMusica(new TypeMusic()).build();
		List<UserPoll> listUserEntity = new ArrayList<UserPoll>();
		listUserEntity.add(userPoll);
		when(userRepository.findAll()).thenReturn(listUserEntity);
		List<UserDto> listaProductos = musicPollServices.getAllUserPoll();
		assertFalse(listaProductos.isEmpty());
	}

	@Test
	void testCrearEncuesta() {
		UserPoll userPoll = UserPoll.builder().mail("mail 1").tipoMusica(new TypeMusic()).build();
		UserDto userDto = UserDto.builder().mail("mail 1").typeMusicId("1").build();
		when(userRepository.save(any(UserPoll.class))).thenReturn(userPoll);
		musicPollServices.createUserPoll(userDto);

	}

}
