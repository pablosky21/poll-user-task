package com.app.musicpoll.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.app.musicpoll.dto.UserDto;
import com.app.musicpoll.entity.UserPoll;

@Mapper(componentModel = "spring")
public interface UserMapper {

	@Mapping(source = "user.mail", target = "mail")
	@Mapping(source = "user.tipoMusica.descripcion", target = "descripcion")
	UserDto entityToDto(UserPoll user);

	@Mapping(source = "userDto.mail", target = "mail")
	@Mapping(source = "userDto.typeMusicId", target = "tipoMusica.id")
	UserPoll dtoToEntity(UserDto userDto);

}
