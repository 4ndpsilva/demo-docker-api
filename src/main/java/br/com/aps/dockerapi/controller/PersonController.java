package br.com.aps.dockerapi.controller;

import br.com.aps.dockerapi.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/peoples")
public class PersonController {

    @GetMapping("/complete-name")
    public Person findPersonByName(){
        var person = new Person();
        person.setId(1L);
        person.setName("André Pereira da Silva");
        person.setBirthDate(LocalDate.of(1985, 5, 12));
        return person;
    }
}