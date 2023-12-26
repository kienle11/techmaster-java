package com.example.demo.service;

import com.example.demo.dao.PersonDAO;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDAO bookDAO;
    public List<Person> getAllPerson() {
        return PersonDAO.findAll();
    }

    public Person getPersonById(int id) {
        return PersonDAO.findById(id);
    }
}
