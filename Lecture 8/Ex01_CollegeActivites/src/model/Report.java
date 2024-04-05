package model;

public class Report {
    private char[] reportSubject;
    private int reportNumberPage;

    public Report(char[] reportSubject, int reportNumberPage) {
        this.reportSubject = reportSubject;
        this.reportNumberPage = reportNumberPage;
    }

    public char[] getReportSubject() {
        return reportSubject;
    }

    public void setReportSubject(char[] reportSubject) {
        this.reportSubject = reportSubject;
    }

    public int getReportNumberPage() {
        return reportNumberPage;
    }

    public void setReportNumberPage(int reportNumberPage) {
        this.reportNumberPage = reportNumberPage;
    }

    @Override
    public String toString() {
        return "Report [Subject=" + new String(reportSubject) + ", Pages=" + reportNumberPage
                + "]";
    }

}
