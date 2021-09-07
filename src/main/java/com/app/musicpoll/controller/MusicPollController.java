package com.app.musicpoll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.musicpoll.dto.TypeMusicDto;
import com.app.musicpoll.dto.UserDto;
import com.app.musicpoll.service.MusicPollServices;


/**
 * The Class MusicPollController.
 */
@RestController
public class MusicPollController {

	/** The music poll services. */
	@Autowired
	MusicPollServices musicPollServices;

	/**
	 * Gets the music type.
	 *
	 * @return the music type
	 */
	@GetMapping(value = "/getMusicType", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TypeMusicDto> getMusicType() {

		return musicPollServices.getMusicType();
	}

	/**
	 * Creates the user poll.
	 *
	 * @param userDto the user dto
	 */
	@PostMapping(value = "/createUserPoll", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createUserPoll(@RequestBody UserDto userDto) {

		musicPollServices.createUserPoll(userDto);

	}

	/**
	 * Gets the all user poll.
	 *
	 * @return the all user poll
	 */
	@GetMapping(value = "/getAllUserPoll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<UserDto> getAllUserPoll() {

		return musicPollServices.getAllUserPoll();
	}

}
