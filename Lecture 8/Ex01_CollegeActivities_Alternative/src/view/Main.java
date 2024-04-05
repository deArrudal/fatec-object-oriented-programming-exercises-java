package view;

import controller.ActivityController;
import model.Activity;
import model.Report;
import model.Test;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        ActivityController<Activity> activities = new ActivityController<>();
        String[] reportTypes = { "Laboratoy", "Presentation" };

        for (int i = 0; i < 3; i++) {
            activities.addActivity(new Test(
                    rnd.nextInt(5, 16), rnd.nextFloat(0, 10.01f)));

            activities.addActivity(new Report(
                    reportTypes[rnd.nextInt(2)], rnd.nextInt(1, 5)));

        }

        activities.printActivities();
        
        activities.removeActivity(activities.geActivity(2));
        activities.printActivities();
        
        activities.clearActivities();
        activities.printActivities();

    }
}
