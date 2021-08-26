package br.com.aps.dockerapi.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Person {
    private Long id;
    private String name;
    private LocalDate birthDate;
}