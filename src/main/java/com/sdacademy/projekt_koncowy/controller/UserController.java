package com.sdacademy.projekt_koncowy.controller;

import com.sdacademy.projekt_koncowy.model.User;
import com.sdacademy.projekt_koncowy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//zwraca konkretny rezultat, np liste uzytkownikow. Gdybym miala po prostu @Controller zwracalby np strone www
public class UserController {
    //post- wysylam dane
    //delete- usuwam
    //put- zmieniam np. login
    //get- pobieram
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users") //fragment paska adresu strony www odpowiedzialny za wyswietlanie uzytkownikow
    public List<User> getAllUsers() {
        return userService.getAllUser(); //dobieram sie przez userService i zwraca mi wszystkich uzytkownikow
    }


    @PostMapping("/registerUser")
    //adnotacja @RequestParam oznacza ze pole jest obowiazkowe
    public boolean register(@RequestParam String login,@RequestParam String name, @RequestParam String surname,
                            @RequestParam String password, @RequestParam String email, @RequestParam String phoneNumber) {

        return userService.registration(new User(login, name, surname, password, email, phoneNumber));
    }


}
