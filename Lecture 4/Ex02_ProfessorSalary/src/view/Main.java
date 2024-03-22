package view;

import model.ProfessorHour;
import model.ProfessorYear;

public class Main {
    public static void main(String[] args) {
        ProfessorYear professorA = new ProfessorYear();
        professorA.setProfessorIDNumber("001");
        professorA.setProfessorName("John Doe");
        professorA.setProfessorAge(47);
        professorA.setProfessorYearIngress(2003);
        professorA.setProfessorBaseSalary(3500.00);

        ProfessorHour professorB = new ProfessorHour();
        professorB.setProfessorIDNumber("002");
        professorB.setProfessorName("Kate Lewis");
        professorB.setProfessorAge(32);
        professorB.setProfessorHourRate(23.5);
        professorB.setProfessorHourTime(120);

        System.out.printf("Professor: %s\n", professorA.getProfessorName());
        professorA.computePaycheck();

        System.out.printf("Professor: %s\n", professorB.getProfessorName());
        professorB.computePaycheck();
    }
}
