Meris Bihorac 3/12/2021

How to read file in Java:

1. First of all open the file via Notepad or Excel so we can see the file raw.
2. Now since we know how the file looks like, we are going to create class "Person" and read the file.
3. We are going to create 5 variables and they are:
Integer Id
String FirstName
String LastName
String Email
String Gender
4. Now we are going to create constructor, so we could use them in our "Main" class.
5. Since we have successfully created our constructor we want to start with reading the file.
6. We want to create method which returns List, that's why we are going to create the following Method:

public static List<Person> AddPerson (List<String> lines){ => it must be static so we could use it in our Main class
        List<Person> personList = new ArrayList<>(); => List to save our persons
        lines.stream().forEach(line -> {String[] splitter = line.split(","); => Going thourgh each line and checking
        if the line contains "," , if yes we are splitting there.
        personList.add(new Person(Integer.parseInt(splitter[0]),splitter[1],splitter[2],splitter[3],splitter[4]));
        }); => Adding the values we splitted

        return personList; // returning our person list
    }
7. Now we want to output our files, in order to do that, we need to create method where we set our file path
  public static List<String> ReadFiles(String path) throws IOException { => We want to return List back
        return Files.readAllLines(Paths.get("src/MOCK_DATA.csv")); => Setting the path, we could also set relative path.
    }

    Main class:
 List<String> lines = ReadFiles("src/MOCK_DATA.csv"); => Reading the files
 Now the list looks like following;
    id,first_name,last_name,email,gender
    1,Aurel,Somner,asomner0@msu.edu,Female
    2,Ali,Sellack,asellack1@dagondesign.com,Female
 lines.remove(0); => Removing the header
 List<Person> personList = Person.AddPerson(lines); => Saving them in our list
 personList.forEach(System.out::println); => Printing the list out, we need to use forEach to print every single person.
 8. Last but not least we want to make our own toString method, so the output looks nicer.
 @Override
    public String toString(){
        return "Id: " + Id + " " + "Firstname: " + FirstName + " " + "Lastname: " + LastName
                + " " + "Email: " + Email + " " + "Gender: " + Gender;
    }

    Now our output looks like following:

    Id: 999 Firstname: Florette Lastname: Ashard Email: fashardrq@bbc.co.uk Gender: Bigender
    Id: 1000 Firstname: Reade Lastname: Dallimare Email: rdallimarerr@usnews.com Gender: Female