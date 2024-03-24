package view;

import controller.StudentCollegeController;
import controller.StudentTechnicalController;
import model.StudentCollege;
import model.StudentTechnical;

public class Main {
    public static void main(String[] args) {
        StudentCollege studentCollege = new StudentCollege();
        studentCollege.setStudentNumber("001");
        studentCollege.setStudentName("John Doe");
        studentCollege.setStudentEmail("johndoe@mail.com");
        studentCollege.setStudentAverageScore(7.0f);
        studentCollege.setStudentQtdSubject(5);
        studentCollege.setStudentHighSchoolName("Daytona Beach High School");
        studentCollege.setStudentHighSchoolConclusionYear(2008);

        StudentCollegeController studentCollegeController = new StudentCollegeController();

        StudentTechnical studentTechnical = new StudentTechnical();
        studentTechnical.setStudentNumber("002");
        studentTechnical.setStudentName("Mike O'malley");
        studentTechnical.setStudentEmail("mikeomalley@mail.com");
        studentTechnical.setStudentAverageScore(8.5f);
        studentTechnical.setStudentQtdSubject(3);

        StudentTechnicalController studentTechnicalController = new StudentTechnicalController();

        System.out.printf("%s\nPerformance=%.2f\nProgression=%.2f\n",
                studentCollege.toString(), studentCollegeController.computePerformance(studentCollege),
                studentCollegeController.computeProgression(studentCollege));

        System.out.printf("%s\nPerformance=%.2f\nProgression=%.2f\n",
                studentTechnical.toString(), studentTechnicalController.computePerformance(studentTechnical),
                studentTechnicalController.computeProgression(studentTechnical));
    }

}