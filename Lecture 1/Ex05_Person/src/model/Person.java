package model;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String personName = "";
    private LocalDate personBirthDate = LocalDate.now(); // default value.
    private String personRole = "";

    public Person() {
        super();
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonBirthDate() {
        return personBirthDate.toString();
    }

    public void setPersonBirthDate(int year, int month, int dayOfMonth) {
        LocalDate tmp = LocalDate.of(year, month, dayOfMonth);

        if (Period.between(tmp, LocalDate.now()).getYears() > 150) {
            System.out.println("Invalid birth date");
            return;
        }

        this.personBirthDate = tmp;
    }

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }

    public int getAge() {
        return Period.between(personBirthDate, LocalDate.now()).getYears();
    }

}
