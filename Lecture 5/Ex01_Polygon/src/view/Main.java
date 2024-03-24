package view;

import model.Parallelogram;
import model.Trapezoid;

public class Main {
    public static void main(String[] args) {
        Trapezoid trapezoid = new Trapezoid();
        trapezoid.setQuadrilateralBase(16);
        trapezoid.setQuadrilateralHeight(4);
        trapezoid.setQuadrilateralAngle(45);
        trapezoid.setTrapezoidMinorBase(8);

        System.out.println("Trapezoid");
        System.out.printf("Area: %.2f\nPerimeter: %.2f\n",
                trapezoid.computeArea(), trapezoid.computePerimeter());

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.setQuadrilateralBase(11);
        parallelogram.setQuadrilateralHeight(3);
        parallelogram.setQuadrilateralAngle(45);

        System.out.println("Parallelogram");
        System.out.printf("Area: %.2f\nPerimeter: %.2f\n",
                parallelogram.computeArea(), parallelogram.computePerimeter());
    }
}
