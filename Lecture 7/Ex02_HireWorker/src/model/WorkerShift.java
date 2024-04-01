package model;

public class WorkerShift extends Worker {
    private String workerStartShift;
    private String workerEndShift;

    public WorkerShift() {
        super();
    }

    public String getWorkerStartShift() {
        return workerStartShift;
    }

    public void setWorkerStartShift(String workerStartShift) {
        this.workerStartShift = workerStartShift;
    }

    public String getWorkerEndShift() {
        return workerEndShift;
    }

    public void setWorkerEndShift(String workerEndShift) {
        this.workerEndShift = workerEndShift;
    }

    @Override
    public String toString() {
        return "FullTime [ID=" + getWorkerID() + ", Name=" + getWorkerName()
                + ", Paycheck=" + getWorkerPaycheck() + ", Shift="
                + workerStartShift + " - " + workerEndShift + "]";
    }

}