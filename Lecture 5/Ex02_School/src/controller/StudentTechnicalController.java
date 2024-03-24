package controller;

import model.Student;

public class StudentTechnicalController implements IStudentController {
    public StudentTechnicalController() {
        super();
    }

    @Override
    public float computePerformance(Student student) {
        return student.getStudentAverageScore()
                * student.getStudentQtdSubject() * 0.931f;
    }

    @Override
    public float computeProgression(Student student) {
        return ((float) student.getStudentQtdSubject()) / 3;
    }
}
