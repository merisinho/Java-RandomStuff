package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {
    Integer Id;
    String FirstName;
    String LastName;
    String Email;
    String Gender;

    public Person(Integer Id, String FirstName, String LastName,
                  String Email, String Gender) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Gender = Gender;
    }

    public static List<Person> AddPerson(List<String> lines) {
        List<Person> personList = new ArrayList<>();
        lines.stream().forEach(line -> {
            String[] splitter = line.split(",");
            personList.add(new Person(Integer.parseInt(splitter[0]), splitter[1], splitter[2], splitter[3], splitter[4]));
        });
        return personList;
    }

    @Override
    public String toString() {
        return "Id: " + Id + " " + "Firstname: " + FirstName + " " + "Lastname: " + LastName
                + " " + "Email: " + Email + " " + "Gender: " + Gender;
    }

}
