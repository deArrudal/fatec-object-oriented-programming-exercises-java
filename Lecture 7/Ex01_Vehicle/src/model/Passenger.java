package model;

public final class Passenger extends Vehicle {
    private int passengerNumPassenger;

    public Passenger() {
        super();
    }

    public int getPassengerNumPassenger() {
        return passengerNumPassenger;
    }

    public final void setPassengerNumPassenger(int passengerNumPassenger) {
        this.passengerNumPassenger = passengerNumPassenger;
    }

    @Override
    public float computeSpeed(float maxSpeed) {
        // Input: [km/h] Output: [m/h]
        return maxSpeed * 1000;
    }

    @Override
    public String toString() {
        return "Vehicle [Plate=" + getVehiclePlate() + ", Brand=" + getVehicleBrand()
                + ", Model=" + getVehicleModel() + ", Color=" + getVehicleColor()
                + ", Passengers=" + passengerNumPassenger + ", MaxSpeed=" + getVehicleMaxSpeed()
                + ", NumWheel=" + getVehicleNumWheel() + ", Engine=" + getVehicleEngine() + "]";
    }

}
