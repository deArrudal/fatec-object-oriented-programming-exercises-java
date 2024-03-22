package model;

import java.time.LocalDate;

public class ProfessorYear extends Professor {
    private int professorYearIngress;
    private double professorBaseSalary;

    public ProfessorYear() {
        super();
    }

    public int getProfessorYearIngress() {
        return professorYearIngress;
    }

    public void setProfessorYearIngress(int professorYearIngress) {
        this.professorYearIngress = professorYearIngress;
    }

    public double getProfessorBaseSalary() {
        return professorBaseSalary;
    }

    public void setProfessorBaseSalary(double professorBaseSalary) {
        this.professorBaseSalary = professorBaseSalary;
    }

    @Override
    public void computePaycheck() {
        System.out.printf("Paycheck: $%.2f\n",
                professorBaseSalary * Math.pow(1.05, (LocalDate.now().getYear() - professorYearIngress) / 5));
        // x * (1 + 5%)^(now - ingress)
    }
}
