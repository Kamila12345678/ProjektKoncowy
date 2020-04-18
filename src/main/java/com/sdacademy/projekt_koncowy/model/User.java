package com.sdacademy.projekt_koncowy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class User {

    @Id
    @Column(length = 16) //16 poniewaz UUID ma 16 znakow i taka musi byc dlugosc kolumny
    private UUID userId;

    @NotBlank
    @Size(min = 3, max = 255)
    private String login;

    @NotBlank
    @Size(min = 3, max = 255)
    private String name;

    @NotBlank
    @Size(min = 3, max = 255)
    private String surname;

    @NotBlank
    @Size(min = 6, max = 255)
    private String password;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size(min = 3, max = 255)
    private String phoneNumber;

    public User(@NotBlank @Size(min = 3, max = 255) String login, @NotBlank @Size(min = 3, max = 255)
            String name, @NotBlank @Size(min = 3, max = 255) String surname, @NotBlank @Size(min = 6, max = 255)
            String password, @NotBlank @Email String email, @NotBlank @Size(min = 3, max = 255) String phoneNumber) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
