package controller;

import java.util.ArrayList;

import model.Test;

public class TestController implements IActivityController<Test> {

    private ArrayList<Test> tests;

    public TestController() {
        this.tests = new ArrayList<>();
    }

    @Override
    public void addActivity(Test test) {
        tests.add(test);
    }

    @Override
    public void removeActivity(Test test) {
        tests.remove(test);
    }

    @Override
    public Test findActivity(int index) {
        return tests.get(index);
    }

    @Override
    public void clearList() {
        tests.clear();
    }

    @Override
    public void displayList() {
        int i = 0;
        for (Test test : tests) {
            System.out.printf("[%d] %s\n", i, test.toString());
            i++;
        }
    }

}
