package view;

import model.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        double discounts = 120.00;
        double benefits = 95.00;

        worker.setWorkerName("John Doe");
        worker.setWorkerRole("Manager");

        worker.setWorkerGrossSalary(1200.00);
        worker.setWorkerGrossSalary(2200.00);

        System.out.printf("Employee: %s\n", worker.getWorkerName());
        System.out.printf("Role: %s\n", worker.getWorkerRole());
        System.out.printf("Gross Salary: %.2f\n", worker.getWorkerGrossSalary());

        System.out.printf("Discounts: %.2f\n", discounts);
        System.out.printf("Benefits: %.2f\n", benefits);
        System.out.printf("Net Salary: %.2f\n", worker.computeNetSalary(discounts, benefits));

    }
}
