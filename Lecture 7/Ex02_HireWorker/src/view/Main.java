package view;

import controller.*;
import model.Worker;

public class Main {
    public static void main(String[] args) {
        ControllerWorkerFactory workerFullTime = new ControllerWorkerFullTime();
        ControllerWorkerFactory workerShift = new ControllerWorkerShift();
        ControllerWorkerFactory workerTemporary = new ControllerWorkerTemporary();

        Worker worker1 = workerFullTime.hireWorker(new String[] { "001", "John Doe", "2500.00", "160" });
        System.out.println(worker1.toString());

        Worker worker2 = workerShift.hireWorker(new String[] { "002", "Mike Lewis", "2150.00", "08:00", "17:00" });
        System.out.println(worker2.toString());

        Worker worker3 = workerTemporary.hireWorker(new String[] { "003", "Kate Willows", "1500.00", "31", "08", "24" });
        System.out.println(worker3.toString());

    }
}