package com.app.musicpoll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.musicpoll.entity.UserPoll;


@Repository
public interface UserRepository extends JpaRepository<UserPoll, Integer> {

}
