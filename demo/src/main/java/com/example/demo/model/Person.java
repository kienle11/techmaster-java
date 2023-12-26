package com.example.demo.model;

import lombok.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    private int id;
    private String fullname;
    private String job;
    private String gender;
    private String city;
    private int salary;
    private LocalDate birthday;
    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    public void setBirthday(String birthday){
        this.birthday = LocalDate.parse(birthday, dateFormatter);
    }
}
