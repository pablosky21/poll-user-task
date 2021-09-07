package com.app.musicpoll.mapper;

import org.mapstruct.Mapper;

import com.app.musicpoll.dto.TypeMusicDto;
import com.app.musicpoll.entity.TypeMusic;

@Mapper(componentModel = "spring")
public interface TypeMusicMapper {

	TypeMusicDto entityToDto(TypeMusic typeMusic);

	TypeMusic dtoToEntity(TypeMusicDto typeMusicDto);

}
