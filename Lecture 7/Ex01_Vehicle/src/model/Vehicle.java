package model;

public abstract class Vehicle {
    private String vehiclePlate;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleColor;
    private float vehicleMaxSpeed;
    private int vehicleNumWheel;
    private Engine vehicleEngine;

    public Vehicle() {
        super();
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public final void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public final void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public final void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public final void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public float getVehicleMaxSpeed() {
        return vehicleMaxSpeed;
    }

    public final void setVehicleMaxSpeed(float vehicleMaxSpeed) {
        this.vehicleMaxSpeed = vehicleMaxSpeed;
    }

    public int getVehicleNumWheel() {
        return vehicleNumWheel;
    }

    public final void setVehicleNumWheel(int vehicleNumWheel) {
        this.vehicleNumWheel = vehicleNumWheel;
    }

    public Engine getVehicleEngine() {
        return vehicleEngine;
    }

    public final void setVehicleEngine(Engine vehicleEngine) {
        this.vehicleEngine = vehicleEngine;
    }

    public abstract float computeSpeed(float maxSpeed);

}
