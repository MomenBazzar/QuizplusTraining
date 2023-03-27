package designPatterns.factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.getVehicleOfType(VehicleType.CAR);
        car.seats();

        Vehicle bus = factory.getVehicleOfType(VehicleType.BUS);
        bus.seats();
    }
}

