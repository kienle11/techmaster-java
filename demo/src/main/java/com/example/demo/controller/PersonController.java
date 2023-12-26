package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PersonController {
    @Autowired
    private PersonService PersonService;

     //GET: http://localhost:8080/books
    @GetMapping("/persons")
    public List<Person> getPersonList() {
        List<Person> personList = PersonService.getAllPerson();
        return personList;
    }}
