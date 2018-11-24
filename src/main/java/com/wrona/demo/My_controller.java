package com.wrona.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class My_controller {
    @GetMapping
    public String hello(){
        String nowy = "czesc";
        return nowy;
    }
    @GetMapping(value = "/drugiepozdrowienie")
    public String helloaggain(){
        String nowy = "czescponownie";
        return nowy;
    }
    @GetMapping(value = "/milosz")
    public Person GetPerson(){
        Person person = new Person();
        person.setName("milosz");
        person.setAge(19);
        return person;
    }
    @GetMapping(value = "/people")
    public List<Person> GetAllPeople(){
        Person jacek = new Person();
        Person wacek = new Person();
        jacek.setName("jacek");
        wacek.setName("wacek");
        List <Person> MojaLista = new ArrayList<>();
        MojaLista.add(jacek);
        MojaLista.add(wacek);
        return MojaLista;
    }
}
