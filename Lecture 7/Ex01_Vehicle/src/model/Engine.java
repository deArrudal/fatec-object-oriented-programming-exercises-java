package model;

public class Engine {
    private int enginePistonNumber;
    private int enginePower;

    public Engine() {
        super();
    }

    public int getEnginePistonNumber() {
        return enginePistonNumber;
    }

    public final void setEnginePistonNumber(int enginePistonNumber) {
        this.enginePistonNumber = enginePistonNumber;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public final void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "{Pistons=" + enginePistonNumber + ", Power=" + enginePower + "}";
    }

}
