package com.example.myProjectJava.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {

                  Student mariam =   new Student(

                            "Mariam",

                            LocalDate.of(1999,01,18),
                            "mariam@gmail.com"
                    );
            Student alex =   new Student(

                    "Alex",

                    LocalDate.of(1968,05,30),
                    "alex@gmail.com"
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );

        };
    }
}
