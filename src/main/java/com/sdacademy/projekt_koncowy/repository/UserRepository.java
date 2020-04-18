package com.sdacademy.projekt_koncowy.repository;

import com.sdacademy.projekt_koncowy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

//wszystko co sluzy do komunikacji z db w Springu bedzie interfejsem
public interface UserRepository extends JpaRepository<User, UUID> {

}
