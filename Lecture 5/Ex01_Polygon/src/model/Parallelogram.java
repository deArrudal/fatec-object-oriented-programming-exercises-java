package model;

public class Parallelogram extends Quadrilateral {
    public Parallelogram() {
        super();
    }

    @Override
    public float computeArea() {
        return getQuadrilateralBase() * getQuadrilateralHeight();
    }

}
