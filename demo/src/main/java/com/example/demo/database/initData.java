package com.example.demo.database;

import com.example.demo.ultis.CSVReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class initData implements CommandLineRunner {
    private final CSVReader csvReader;

    public initData(CSVReader csvReader) {
        this.csvReader = csvReader;
    }

    @Override
    public void run(String... args) throws Exception {
        PersonDB.personList = csvReader.readFile("person.csv");
        System.out.println(PersonDB.personList.size());
        csvReader.writeFile("output.csv", PersonDB.personList);

    }
}
