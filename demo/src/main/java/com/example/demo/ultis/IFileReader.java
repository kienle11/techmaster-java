package com.example.demo.ultis;

import com.example.demo.model.Person;

import java.util.List;

public interface IFileReader {
    List<Person> readFile (String filePath);
}
