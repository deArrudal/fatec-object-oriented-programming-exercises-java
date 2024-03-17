package model;

public class Worker {
    private String workerName = "";
    private String workerRole = "";
    private double workerGrossSalary = 0.00;

    public Worker() {
        super();
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerRole() {
        return workerRole;
    }

    public void setWorkerRole(String workerRole) {
        this.workerRole = workerRole;
    }

    public double getWorkerGrossSalary() {
        return workerGrossSalary;
    }

    public void setWorkerGrossSalary(double workerGrossSalary) {
        if (workerGrossSalary < 1412.00) {
            System.out.println("Invalid value, Minimum wage = R$ 1412.00");
            return;
        }
        this.workerGrossSalary = workerGrossSalary;
    }

    public double computeNetSalary(double discounts, double benefits) {
        return workerGrossSalary + benefits - discounts;
    }

}
