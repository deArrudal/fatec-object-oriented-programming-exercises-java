package controller;

import model.Worker;
import model.WorkerShift;

public class ControllerWorkerShift extends ControllerWorkerFactory {
    public ControllerWorkerShift() {
        super();
    }

    @Override
    public Worker hireWorker(String[] args) {
        WorkerShift worker = new WorkerShift();
        worker.setWorkerID(args[0]);
        worker.setWorkerName(args[1]);
        worker.setWorkerPaycheck(Float.parseFloat(args[2]));
        worker.setWorkerStartShift(args[3]);
        worker.setWorkerEndShift(args[4]);
        return worker;
    }

}
