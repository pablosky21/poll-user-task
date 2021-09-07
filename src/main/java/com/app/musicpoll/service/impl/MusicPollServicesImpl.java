package com.app.musicpoll.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.musicpoll.dto.TypeMusicDto;
import com.app.musicpoll.dto.UserDto;
import com.app.musicpoll.entity.TypeMusic;
import com.app.musicpoll.entity.UserPoll;
import com.app.musicpoll.mapper.TypeMusicMapper;
import com.app.musicpoll.mapper.UserMapper;
import com.app.musicpoll.repository.TypeMusicRepository;
import com.app.musicpoll.repository.UserRepository;
import com.app.musicpoll.service.MusicPollServices;

/**
 * The Class MusicPollServicesImpl.
 */
@Service
public class MusicPollServicesImpl implements MusicPollServices {

	/** The user repository. */
	@Autowired
	UserRepository userRepository;

	/** The type music repository. */
	@Autowired
	TypeMusicRepository typeMusicRepository;

	/** The type music mapper. */
	@Autowired
	TypeMusicMapper typeMusicMapper;

	/** The user mapper. */
	@Autowired
	UserMapper userMapper;

	/** The Constant logger. */
	private static final Logger logger = LoggerFactory.getLogger("MusicPollServices");

	/**
	 * Gets the music type.
	 *
	 * @return the music type
	 */
	@Override
	public List<TypeMusicDto> getMusicType() {
		List<TypeMusicDto> listTypeMusicDto = new ArrayList<TypeMusicDto>();
		List<TypeMusic> listTypeMusic = new ArrayList<TypeMusic>();
		try {

			listTypeMusic = typeMusicRepository.findAll();
			listTypeMusic.forEach((p) -> listTypeMusicDto.add(typeMusicMapper.entityToDto(p)));
		} catch (Exception e) {
			logger.error("getMusicType Error-----", e);
		}
		return listTypeMusicDto;
	}

	/**
	 * Creates the user poll.
	 *
	 * @param userDto the user dto
	 */
	@Override
	public void createUserPoll(UserDto userDto) {
		try {
			UserPoll entity = userMapper.dtoToEntity(userDto);
			userRepository.save(entity);
		} catch (Exception e) {
			logger.error("createUserPoll Error-----", e);
		}

	}

	/**
	 * Gets the all user poll.
	 *
	 * @return the all user poll
	 */
	@Override
	public List<UserDto> getAllUserPoll() {
		List<UserDto> listTypeMusicDto = new ArrayList<UserDto>();
		List<UserPoll> listTypeMusic = new ArrayList<UserPoll>();
		try {

			listTypeMusic = userRepository.findAll();
			listTypeMusic.forEach((p) -> listTypeMusicDto.add(userMapper.entityToDto(p)));
		} catch (Exception e) {
			logger.error("getAllUserPoll Error-----", e);
		}
		return listTypeMusicDto;
	}

}
