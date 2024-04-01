package model;

public class WorkerTemporary extends Worker {
    private int workerEndContractDay;
    private int workerEndContractMonth;
    private int workerEndContractYear;

    public WorkerTemporary() {
        super();
    }

    public int getWorkerEndContractDay() {
        return workerEndContractDay;
    }

    public void setWorkerEndContractDay(int workerEndContractDay) {
        this.workerEndContractDay = workerEndContractDay;
    }

    public int getWorkerEndContractMonth() {
        return workerEndContractMonth;
    }

    public void setWorkerEndContractMonth(int workerEndContractMonth) {
        this.workerEndContractMonth = workerEndContractMonth;
    }

    public int getWorkerEndContractYear() {
        return workerEndContractYear;
    }

    public void setWorkerEndContractYear(int workerEndContractYear) {
        this.workerEndContractYear = workerEndContractYear;
    }

    @Override
    public String toString() {
        return "FullTime [ID=" + getWorkerID() + ", Name=" + getWorkerName()
                + ", Paycheck=" + getWorkerPaycheck() + ", End Contract="
                + workerEndContractDay + "/" + workerEndContractMonth + "/"
                + workerEndContractYear + "]";
    }

}
