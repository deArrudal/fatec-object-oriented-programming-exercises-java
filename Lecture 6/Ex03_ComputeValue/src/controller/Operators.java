package controller;

public class Operators {
    public double computeValue(int value) {
        if (value < 0) {
            throw new ArithmeticException("Entry must be a positive integer");
        } else if ((value % 2) == 0) {
            return Math.pow(value, 2);
        }
        return Math.pow(value, 3);
    }
}
