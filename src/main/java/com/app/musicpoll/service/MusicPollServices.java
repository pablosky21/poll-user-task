package com.app.musicpoll.service;

import java.util.List;

import com.app.musicpoll.dto.TypeMusicDto;
import com.app.musicpoll.dto.UserDto;

/**
 * The Interface MusicPollServices.
 */
public interface MusicPollServices {

	/**
	 * Gets the music type.
	 *
	 * @return the music type
	 */
	public List<TypeMusicDto> getMusicType();

	/**
	 * Creates the user poll.
	 *
	 * @param userDto the user dto
	 */
	public void createUserPoll(UserDto userDto);

	/**
	 * Gets the all user poll.
	 *
	 * @return the all user poll
	 */
	public List<UserDto> getAllUserPoll();

}
