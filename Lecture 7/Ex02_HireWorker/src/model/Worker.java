package model;

public class Worker {
    private String workerID;
    private String workerName;
    private float workerPaycheck;

    public Worker() {
        super();
    }

    public String getWorkerID() {
        return workerID;
    }

    public void setWorkerID(String workerID) {
        this.workerID = workerID;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public float getWorkerPaycheck() {
        return workerPaycheck;
    }

    public void setWorkerPaycheck(float workerPaycheck) {
        this.workerPaycheck = workerPaycheck;
    }

}
