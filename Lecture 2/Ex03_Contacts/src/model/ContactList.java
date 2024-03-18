package model;

import java.util.HashMap;

public class ContactList {
    HashMap<String, Person> contacts;

    public ContactList() {
        super();
        contacts = new HashMap<>();
    }

    public void addPerson(Person person) {
        if (contacts.containsKey(person.getPersonName())) {
            System.out.println("Person has already been added");
            return;
        }
        contacts.put(person.getPersonName(), person);
    }

    public void removePerson(String personName) {
        if (!contacts.containsKey(personName)) {
            System.out.println("Person not found");
            return;
        }
        contacts.remove(personName);
    }

    public Person findPerson(String personName) {
        if (!contacts.containsKey(personName)) {
            System.out.println("Person not found");
            return null;
        }
        return contacts.get(personName);
    }

}
