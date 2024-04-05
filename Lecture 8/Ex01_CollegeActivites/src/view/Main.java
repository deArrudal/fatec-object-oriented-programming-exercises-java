package view;

import controller.ReportController;
import controller.TestController;
import model.Report;
import model.Test;

public class Main {
    public static void main(String[] args) {
        TestController testController = new TestController();

        for (int i = 0; i < 5; i++) {
            testController.addActivity(new Test(
                    (int) (Math.random() * 15 + 5), (float) (Math.random() * 10.01)));
        }

        testController.displayList();

        testController.removeActivity(testController.findActivity(2));
        testController.displayList();

        testController.clearList();
        testController.displayList();

        ReportController reportController = new ReportController();

        for (int i = 0; i < 5; i++) {
            reportController.addActivity(new Report(
                    "Practice".toCharArray(), (int) (Math.random() * 9 + 1)));
        }

        reportController.displayList();

        reportController.removeActivity(reportController.findActivity(1));
        reportController.displayList();

        reportController.clearList();
        reportController.displayList();
    }
}