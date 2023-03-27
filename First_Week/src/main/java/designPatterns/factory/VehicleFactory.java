package designPatterns.factory;

public class VehicleFactory {
    public Vehicle getVehicleOfType(VehicleType type){

        if (type == VehicleType.CAR) return new Car();
        if (type == VehicleType.VAN) return new Van();
        if (type == VehicleType.BUS) return new Bus();

        return null;
    }
}

