package view;

import model.Cargo;
import model.Engine;
import model.Passenger;

public class Main {
    public static void main(String[] args) {
        Engine enginePassenger = new Engine();
        enginePassenger.setEnginePistonNumber(4);
        enginePassenger.setEnginePower(169); // hp

        Engine enginePowerCell = new Engine();
        enginePowerCell.setEnginePistonNumber(0);
        enginePowerCell.setEnginePower(182); // hp

        Engine engineCargo = new Engine();
        engineCargo.setEnginePistonNumber(6);
        engineCargo.setEnginePower(236); // hp

        Passenger pass1 = new Passenger();
        pass1.setVehiclePlate("ABC-123");
        pass1.setVehicleBrand("Toyota");
        pass1.setVehicleModel("Corolla");
        pass1.setVehicleColor("Black");
        pass1.setVehicleMaxSpeed(199.00f);
        pass1.setVehicleNumWheel(4);
        pass1.setVehicleEngine(enginePassenger);
        pass1.setPassengerNumPassenger(5);
        System.out.println(pass1.toString());
        System.out.printf("Model: %s - Max. Speed: %.2f m/h\n",
                pass1.getVehicleModel(), pass1.computeSpeed(pass1.getVehicleMaxSpeed()));

        Passenger pass2 = new Passenger();
        pass2.setVehiclePlate("DEF-456");
        pass2.setVehicleBrand("Toyota");
        pass2.setVehicleModel("Mirai");
        pass2.setVehicleColor("Silver");
        pass2.setVehicleMaxSpeed(175.00f);
        pass2.setVehicleNumWheel(4);
        pass2.setVehicleEngine(enginePowerCell);
        pass2.setPassengerNumPassenger(5);
        System.out.println(pass2.toString());
        System.out.printf("Model: %s - Max. Speed: %.2f m/h\n",
                pass2.getVehicleModel(), pass2.computeSpeed(pass2.getVehicleMaxSpeed()));

        Cargo cargo1 = new Cargo();
        cargo1.setVehiclePlate("GHI-789");
        cargo1.setVehicleBrand("Toyota");
        cargo1.setVehicleModel("Tacoma");
        cargo1.setVehicleColor("Blue");
        cargo1.setVehicleMaxSpeed(180.00f);
        cargo1.setVehicleNumWheel(4);
        cargo1.setVehicleEngine(engineCargo);
        cargo1.setCargoMaxLoad(775);
        cargo1.setCargoTare(2140);
        System.out.println(cargo1.toString());
        System.out.printf("Model: %s - Max. Speed: %.2f cm/h\n",
                cargo1.getVehicleModel(), cargo1.computeSpeed(cargo1.getVehicleMaxSpeed()));

        Cargo cargo2 = new Cargo();
        cargo2.setVehiclePlate("GHI-012");
        cargo2.setVehicleBrand("Toyota");
        cargo2.setVehicleModel("Hilux");
        cargo2.setVehicleColor("White");
        cargo2.setVehicleMaxSpeed(168.00f);
        cargo2.setVehicleNumWheel(4);
        cargo2.setVehicleEngine(engineCargo);
        cargo2.setCargoMaxLoad(895);
        cargo2.setCargoTare(2015);
        System.out.println(cargo2.toString());
        System.out.printf("Model: %s - Max. Speed: %.2f cm/h\n",
                cargo2.getVehicleModel(), cargo2.computeSpeed(cargo2.getVehicleMaxSpeed()));

    }
}