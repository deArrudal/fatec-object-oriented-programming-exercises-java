package model;

public class Trapezoid extends Quadrilateral {
    public float trapezoidMinorBase;

    public Trapezoid() {
        super();
    }

    public float getTrapezoidMinorBase() {
        return trapezoidMinorBase;
    }

    public void setTrapezoidMinorBase(float trapezoidMinorBase) {
        this.trapezoidMinorBase = trapezoidMinorBase;
    }

    @Override
    public float computePerimeter() {
        float quadrilateralSide = getQuadrilateralHeight() /
                (float) Math.cos(Math.toRadians(getQuadrilateralAngle()));

        return getQuadrilateralBase() + (2 * quadrilateralSide) + trapezoidMinorBase;
    }

    @Override
    public float computeArea() {
        // A = 1/2 * (Major base + Minor base) * height
        return 0.5f * (getQuadrilateralBase() + trapezoidMinorBase) * getQuadrilateralHeight();
    }
}
