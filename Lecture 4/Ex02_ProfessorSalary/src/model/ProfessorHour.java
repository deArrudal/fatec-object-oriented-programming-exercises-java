package model;

public class ProfessorHour extends Professor {
    private int professorHourTime;
    private double professorHourRate;

    public ProfessorHour() {
        super();
    }

    public int getProfessorHourTime() {
        return professorHourTime;
    }

    public void setProfessorHourTime(int professorHourTime) {
        this.professorHourTime = professorHourTime;
    }

    public double getProfessorHourRate() {
        return professorHourRate;
    }

    public void setProfessorHourRate(double professorHourRate) {
        this.professorHourRate = professorHourRate;
    }

    @Override
    public void computePaycheck() {
        System.out.printf("Paycheck: $%.2f\n",
                professorHourRate * professorHourTime);
    }
}
