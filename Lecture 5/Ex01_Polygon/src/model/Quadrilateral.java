package model;

public abstract class Quadrilateral {
    private float quadrilateralBase;
    private float quadrilateralHeight;
    private float quadrilateralAngle;

    public Quadrilateral() {
        super();
    }

    public float getQuadrilateralBase() {
        return quadrilateralBase;
    }

    public void setQuadrilateralBase(float quadrilateralBase) {
        this.quadrilateralBase = quadrilateralBase;
    }

    public float getQuadrilateralHeight() {
        return quadrilateralHeight;
    }

    public void setQuadrilateralHeight(float quadrilateralHeight) {
        this.quadrilateralHeight = quadrilateralHeight;
    }

    public float getQuadrilateralAngle() {
        return quadrilateralAngle;
    }

    public void setQuadrilateralAngle(float quadrilateralAngle) {
        this.quadrilateralAngle = quadrilateralAngle;
    }

    public float computePerimeter() {
        float quadrilateralSide = quadrilateralHeight /
                (float) Math.cos(Math.toRadians(quadrilateralAngle));

        return 2 * (quadrilateralBase + quadrilateralSide);
    }

    public abstract float computeArea();

}
