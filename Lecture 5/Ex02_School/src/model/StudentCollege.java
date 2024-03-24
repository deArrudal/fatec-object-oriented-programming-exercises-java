package model;

public class StudentCollege extends Student {
    private String studentHighSchoolName;
    private int studentHighSchoolConclusionYear;

    public StudentCollege() {
        super();
    }

    public String getStudentHighSchoolName() {
        return studentHighSchoolName;
    }

    public void setStudentHighSchoolName(String studentHighSchoolName) {
        this.studentHighSchoolName = studentHighSchoolName;
    }

    public int getStudentHighSchoolConclusionYear() {
        return studentHighSchoolConclusionYear;
    }

    public void setStudentHighSchoolConclusionYear(int studentHighSchoolConclusionYear) {
        this.studentHighSchoolConclusionYear = studentHighSchoolConclusionYear;
    }

    @Override
    public String toString() {
        return "Student [Number=" + getStudentNumber() + ", Name=" + getStudentName() + ", Email="
                + getStudentEmail() + ", Average Score=" + getStudentAverageScore() + ", Qtd Subject="
                + getStudentQtdSubject() + ", High School=" + studentHighSchoolName + ", Conclusion="
                + studentHighSchoolConclusionYear + "]";
    }
}
