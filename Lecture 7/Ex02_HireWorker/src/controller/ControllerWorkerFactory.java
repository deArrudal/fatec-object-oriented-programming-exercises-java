package controller;

import model.Worker;

public abstract class ControllerWorkerFactory {
    public abstract Worker hireWorker(String[] args);
}
