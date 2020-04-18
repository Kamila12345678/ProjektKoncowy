package com.sdacademy.projekt_koncowy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class ProjektKoncowyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjektKoncowyApplication.class, args);
    }

}
