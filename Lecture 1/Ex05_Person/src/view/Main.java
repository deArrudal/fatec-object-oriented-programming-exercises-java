package view;

import model.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setPersonName("John Doe");
        person.setPersonRole("Student");

        person.setPersonBirthDate(1834, 5, 15);
        person.setPersonBirthDate(1991, 8, 26);

        System.out.printf("Person: %s\n", person.getPersonName());
        System.out.printf("Role: %s\n", person.getPersonRole());
        System.out.printf("Birth Date: %s\n", person.getPersonBirthDate());
        System.out.printf("Age: %d\n", person.getAge());

    }
}
