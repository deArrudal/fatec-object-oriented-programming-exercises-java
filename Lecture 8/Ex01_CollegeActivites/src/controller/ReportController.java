package controller;

import java.util.ArrayList;

import model.Report;

public class ReportController implements IActivityController<Report> {

    private ArrayList<Report> reports;

    public ReportController() {
        this.reports = new ArrayList<>();
    }

    @Override
    public void addActivity(Report report) {
        reports.add(report);
    }

    @Override
    public void removeActivity(Report report) {
        reports.remove(report);
    }

    @Override
    public Report findActivity(int index) {
        return reports.get(index);
    }

    @Override
    public void clearList() {
        reports.clear();
    }

    @Override
    public void displayList() {
        int i = 0;
        for (Report report : reports) {
            System.out.printf("[%d] %s\n", i, report.toString());
            i++;
        }
    }

}
