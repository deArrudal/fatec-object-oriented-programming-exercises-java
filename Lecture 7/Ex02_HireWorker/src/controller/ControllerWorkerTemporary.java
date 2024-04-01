package controller;

import model.Worker;
import model.WorkerTemporary;

public class ControllerWorkerTemporary extends ControllerWorkerFactory {
    public ControllerWorkerTemporary() {
        super();
    }

    @Override
    public Worker hireWorker(String[] args) {
        WorkerTemporary worker = new WorkerTemporary();
        worker.setWorkerID(args[0]);
        worker.setWorkerName(args[1]);
        worker.setWorkerPaycheck(Float.parseFloat(args[2]));
        worker.setWorkerEndContractDay(Integer.parseInt(args[3]));
        worker.setWorkerEndContractMonth(Integer.parseInt(args[4]));
        worker.setWorkerEndContractYear(Integer.parseInt(args[5]));
        return worker;
    }

}
