package com.meris;

import java.util.ArrayList;
import java.util.List;

public class Person {
    Integer Id; // Variable
    String FirstName; // Variable
    String LastName; // Variable
    String Email; // Variable
    String Gender; // Variable

    public Person(Integer Id, String FirstName, String LastName, // Constructor
                  String Email, String Gender) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Gender = Gender;
    }

    public static List<Person> AddPerson(List<String> lines) { // Method for adding persons in our list
        List<Person> personList = new ArrayList<>(); // Creating list to save persons
        lines.stream().forEach(line -> {
            String[] splitter = line.split(","); // Splitting at "," because that is how or csv files looks like 1,Gill,Valentin,gvalentin0@wp.com,Non-binary
            personList.add(new Person(Integer.parseInt(splitter[0]), splitter[1], splitter[2], splitter[3], splitter[4]));
        });
        return personList;
    }

    @Override
    public String toString() { // toString for better console output
        return "Id: " + Id + " " + "Firstname: " + FirstName + " " + "Lastname: " + LastName
                + " " + "Email: " + Email + " " + "Gender: " + Gender;
    }
}