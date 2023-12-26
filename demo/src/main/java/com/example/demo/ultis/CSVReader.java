package com.example.demo.ultis;

import com.example.demo.model.Person;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@Component
public class CSVReader implements IFileReader {
    @Override
    public List<Person> readFile(String filePath) {
        try {
            Reader reader = Files.newBufferedReader(Paths.get(filePath));
            {
                return new CsvToBeanBuilder<Person>(reader)
                        .withType(Person.class)
                        .build()
                        .parse();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    public void writeFile(String filePath, List<Person> personList) {
        try (FileWriter writer = new FileWriter(filePath)) {
            StatefulBeanToCsv<Person> beanToCsv = new StatefulBeanToCsvBuilder<Person>(writer).build();
            beanToCsv.write(personList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

