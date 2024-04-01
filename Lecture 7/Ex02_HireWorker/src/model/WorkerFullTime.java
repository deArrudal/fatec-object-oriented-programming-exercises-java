package model;

public class WorkerFullTime extends Worker {
    private int workerWorkHour;

    public WorkerFullTime() {
        super();
    }

    public int getWorkerWorkHour() {
        return workerWorkHour;
    }

    public void setWorkerWorkHour(int workerWorkHour) {
        this.workerWorkHour = workerWorkHour;
    }

    @Override
    public String toString() {
        return "FullTime [ID=" + getWorkerID() + ", Name=" + getWorkerName()
                + ", Paycheck=" + getWorkerPaycheck() + ", WorkHours=" + workerWorkHour
                + "]";
    }
}
