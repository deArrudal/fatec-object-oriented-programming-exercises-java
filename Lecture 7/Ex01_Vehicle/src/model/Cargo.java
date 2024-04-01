package model;

public class Cargo extends Vehicle {
    private int cargoMaxLoad;
    private int cargoTare;

    public Cargo() {
        super();
    }

    public int getCargoMaxLoad() {
        return cargoMaxLoad;
    }

    public final void setCargoMaxLoad(int cargoMaxLoad) {
        this.cargoMaxLoad = cargoMaxLoad;
    }

    public int getCargoTare() {
        return cargoTare;
    }

    public final void setCargoTare(int cargoTare) {
        this.cargoTare = cargoTare;
    }

    @Override
    public float computeSpeed(float maxSpeed) {
        // Input: [km/h] Output: [cm/h]
        return maxSpeed * 100000;
    }

    @Override
    public String toString() {
        return "Vehicle [Plate=" + getVehiclePlate() + ", Brand=" + getVehicleBrand()
                + ", Model=" + getVehicleModel() + ", Color=" + getVehicleColor()
                + ", MaxLoad=" + cargoMaxLoad + ", Tare=" + cargoTare
                + ", MaxSpeed=" + getVehicleMaxSpeed() + ", NumWheel=" + getVehicleNumWheel()
                + ", Engine=" + getVehicleEngine() + "]";
    }

}
