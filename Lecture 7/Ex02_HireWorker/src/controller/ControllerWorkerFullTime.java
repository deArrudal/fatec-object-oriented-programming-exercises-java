package controller;

import model.Worker;
import model.WorkerFullTime;

public class ControllerWorkerFullTime extends ControllerWorkerFactory {
    public ControllerWorkerFullTime() {
        super();
    }

    @Override
    public Worker hireWorker(String[] args) {
        WorkerFullTime worker = new WorkerFullTime();
        worker.setWorkerID(args[0]);
        worker.setWorkerName(args[1]);
        worker.setWorkerPaycheck(Float.parseFloat(args[2]));
        worker.setWorkerWorkHour(Integer.parseInt(args[3]));
        return worker;
    }

}
