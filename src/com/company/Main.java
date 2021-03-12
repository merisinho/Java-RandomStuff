package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static List<String> ReadFiles(String path) throws IOException {
        return Files.readAllLines(Paths.get("src/MOCK_DATA.csv"));
    }

    public static void main(String[] args) throws IOException {
        List<String> lines = ReadFiles("src/MOCK_DATA.csv");
        lines.remove(0);
        List<Person> personList = Person.AddPerson(lines);
        personList.forEach(System.out::println);
    }
}
