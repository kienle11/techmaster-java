package pet.entities;

import java.util.ArrayList;

public class Pet {
    private static int autoID;
    private int id;
    private String name;
    private String species;
    private int age;
    private String gender;
    private Type type;
    private String description;
    private String imgs;

    public Pet(String name, int age, String gender, Type type, String description) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
        this.description = description;
        this.id = ++autoID;
    }

    public String getGender() {
        return gender;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return id +
                ", name: " + name + '\'' +
                ", age: " + age +
                ", gender: " + gender + '\'' +
                ", type: " + type +
                ", description: " + description;
    }
}
