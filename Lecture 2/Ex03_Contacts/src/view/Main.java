package view;

import model.ContactList;
import model.Person;

public class Main {
    public static void main(String[] args) {
        ContactList contacts = new ContactList();

        Person person1 = new Person();
        person1.setPersonName("John Doe");
        person1.setPersonTelephone("+(55)1199999-9999");
        person1.setPersonEmail("johndoe@mail.com");

        Person person2 = new Person();
        person2.setPersonName("Mary Doe");
        person2.setPersonTelephone("+(55)1199999-9999");
        person2.setPersonEmail("marydoe@mail.com");

        Person person3 = new Person();
        person3.setPersonName("Mike Tyson");
        person3.setPersonTelephone("+(55)1199999-9999");
        person3.setPersonEmail("miketyson@mail.com");

        contacts.addPerson(person1);
        contacts.addPerson(person1); // try add person1 again.
        contacts.addPerson(person2);
        contacts.addPerson(person3);

        contacts.removePerson("Mike Tyson");
        Person person = contacts.findPerson("Mike Tyson");
        contacts.addPerson(person3);

        person = contacts.findPerson("Mary Doe");
        if (person != null) {
            System.out.printf("Person: %s\n", person.getPersonName());
            System.out.printf("Telephone: %s\n", person.getPersonTelephone());
            System.out.printf("Email: %s\n", person.getPersonEmail());
        }

    }

}
