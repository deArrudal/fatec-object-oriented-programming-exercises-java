package model;

public class Professor {
    private String professorName;
    private String professorIDNumber;
    private int professorAge;

    public Professor() {
        super();
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorIDNumber() {
        return professorIDNumber;
    }

    public void setProfessorIDNumber(String professorIDNumber) {
        this.professorIDNumber = professorIDNumber;
    }

    public int getProfessorAge() {
        return professorAge;
    }

    public void setProfessorAge(int professorAge) {
        this.professorAge = professorAge;
    }

    public void computePaycheck() {}

}
