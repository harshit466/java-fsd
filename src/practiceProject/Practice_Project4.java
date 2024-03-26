package practiceProject;
import java.util.*;

public class Practice_Project4 {
    public static void main(String[] args) {
        // Using the default constructor
        Person person1 = new Person();
        System.out.println("Person 1 - Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Using a parameterized constructor
        Person person2 = new Person("Anshul ", 23);
        System.out.println("Person 2 - Name: " + person2.getName() + ", Age: " + person2.getAge());

        // Using a copy constructor
        Person person3 = new Person(person2);
        System.out.println("Person 3 - Name: " + person3.getName() + ", Age: " + person3.getAge());
    }
}

class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Harshit Goyal";
        this.age = 22;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
