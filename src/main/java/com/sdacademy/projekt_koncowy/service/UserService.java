package com.sdacademy.projekt_koncowy.service;

import com.sdacademy.projekt_koncowy.model.User;
import com.sdacademy.projekt_koncowy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired //wstrzykuje zaleznosci przez konstruktor, bez tworzenia instancji obiektu
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    //czy udalo sie zarejestrowac
    public boolean registration(User user) {
        if (userRepository.findAll().stream().anyMatch(u -> u.getEmail().equals(user.getEmail())) ||
                userRepository.findAll().stream().anyMatch(u -> u.getLogin().equals(user.getLogin()))){
            return false; //jesli email lub login sie powtarzaja, zwroc false
        }
        else {
            user.setUserId(UUID.randomUUID()); //jezeli email i login sa unikatowe to nadaj ID
            userRepository.save(user); //...i zapisz do bazy
            return true;
        }
    }

    //wyciągamy listę Userow
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

}
