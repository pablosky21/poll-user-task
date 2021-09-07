package com.app.musicpoll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.musicpoll.entity.TypeMusic;


@Repository
public interface TypeMusicRepository extends JpaRepository<TypeMusic, Integer> {

}
