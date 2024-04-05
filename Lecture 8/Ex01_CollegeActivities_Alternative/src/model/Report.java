package model;

public class Report implements Activity {
    private char[] reportSubject;
    private int reportPageNumber;

    public Report(String reportSubject, int reportPageNumber) {
        this.reportSubject = reportSubject.toCharArray();
        this.reportPageNumber = reportPageNumber;
    }

    public char[] getReportSubject() {
        return reportSubject;
    }

    public void setReportSubject(char[] reportSubject) {
        this.reportSubject = reportSubject;
    }

    public int getReportPageNumber() {
        return reportPageNumber;
    }

    public void setReportPageNumber(int reportPageNumber) {
        this.reportPageNumber = reportPageNumber;
    }

    @Override
    public String toString() {
        return "Report [Subject=" + String.valueOf(reportSubject) + ", Pages=" + reportPageNumber
                + "]";
    }

}
