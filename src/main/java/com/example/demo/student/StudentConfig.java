package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return args -> {
            Student jack = new Student(
            "jackmoran@example.com",
            "Jack Moran",
            LocalDate.of(1995, 3, 17)
            );
            Student nicole = new Student(
                    "nicolejohnson@example.com",
                    "Nicole Johnson",
                    LocalDate.of(1998, 1, 1)
            );
            studentRepository.saveAll(
                    List.of(jack, nicole)
            );
        };
    }
}
