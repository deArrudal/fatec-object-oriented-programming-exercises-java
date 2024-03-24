package model;

public abstract class Student {
    private String studentNumber;
    private String studentName;
    private String studentEmail;
    private float studentAverageScore;
    private int studentQtdSubject;

    public Student() {
        super();
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public float getStudentAverageScore() {
        return studentAverageScore;
    }

    public void setStudentAverageScore(float studentAverageScore) {
        this.studentAverageScore = studentAverageScore;
    }

    public int getStudentQtdSubject() {
        return studentQtdSubject;
    }

    public void setStudentQtdSubject(int studentQtdSubject) {
        this.studentQtdSubject = studentQtdSubject;
    }

    @Override
    public String toString() {
        return "Student [Number=" + studentNumber + ", Name=" + studentName + ", Email="
                + studentEmail + ", Average Score=" + studentAverageScore + ", Qtd Subject="
                + studentQtdSubject + "]";
    }

}
