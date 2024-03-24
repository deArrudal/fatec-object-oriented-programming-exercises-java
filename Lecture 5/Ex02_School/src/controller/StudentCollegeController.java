package controller;

import model.Student;

public class StudentCollegeController implements IStudentController {
    public StudentCollegeController() {
        super();
    }

    @Override
    public float computePerformance(Student student) {
        return student.getStudentAverageScore()
                * student.getStudentQtdSubject() * 0.972f;
    }

    @Override
    public float computeProgression(Student student) {
        return ((float) student.getStudentQtdSubject()) / 6;
    }
}
