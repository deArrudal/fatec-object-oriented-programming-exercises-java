package view;

import model.Circle;

public class Main {
    public static void main(String[] args) {
        double radius = 0.05; // [m]
        Circle circle = new Circle(radius);

        System.out.printf("Radius: %2.3f\n", radius);
        System.out.printf("Area: %2.3f\n", circle.getArea());
        System.out.printf("Circumference: %2.3f\n", circle.getCircumference());
    }
}
