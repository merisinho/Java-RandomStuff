package com.meris;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static List<String> ReadFiles(String path) throws IOException { // Method for reading the file
        return Files.readAllLines(Paths.get("src/MOCK_DATA.csv"));
    }

    public static void main(String[] args) throws IOException {
        List<String> lines = ReadFiles("src/MOCK_DATA.csv"); // Reading the file
        lines.remove(0); // Removing the header
        List<Person> personList = Person.AddPerson(lines); // Saving the file in our list
        personList.forEach(System.out::println); // Printing the list, forEach means printing every single person
    }
}

