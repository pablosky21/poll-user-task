package com.app.musicpoll.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_musica database table.
 * 
 */
@Entity
@Table(name="tipo_musica")
public class TypeMusic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="seq_tipo_musica",allocationSize = 1 )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq_tipo_musica")
	private Integer id;

	private String descripcion;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="tipoMusica")
	private List<UserPoll> usuarios;

	public TypeMusic() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<UserPoll> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<UserPoll> usuarios) {
		this.usuarios = usuarios;
	}

	public UserPoll addUsuario(UserPoll usuario) {
		getUsuarios().add(usuario);
		usuario.setTipoMusica(this);

		return usuario;
	}

	public UserPoll removeUsuario(UserPoll usuario) {
		getUsuarios().remove(usuario);
		usuario.setTipoMusica(null);

		return usuario;
	}

}