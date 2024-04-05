package controller;

import java.util.ArrayList;

public class ActivityController<Activity> {
    ArrayList<Activity> activities;

    public ActivityController() {
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public Activity geActivity(int index) {
        return activities.get(index);
    }

    public void clearActivities() {
        activities.clear();
    }

    public void printActivities() {
        int i = 0;
        System.out.println("Activities");
        for (Activity activity : activities) {
            System.out.printf("[%d] %s\n", i, activity.toString());
            i++;
        }
    }

}
