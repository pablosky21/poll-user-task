package com.app.musicpoll.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * To string.
 *
 * @return the java.lang. string
 */
@Data

/**
 * To string.
 *
 * @return the java.lang. string
 */
@Builder

/**
 * Instantiates a new user dto.
 */
@NoArgsConstructor

/**
 * Instantiates a new user dto.
 *
 * @param typeMusicId the type music id
 * @param mail        the mail
 * @param name        the name
 */
@AllArgsConstructor
public class UserDto {

	/** The type music id. */
	private String typeMusicId;

	/** The mail. */
	private String mail;
	
	private String descripcion;
	

}
