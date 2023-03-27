package designPatterns.factory;

public class Bus implements Vehicle {

    @Override
    public void seats() {
        System.out.println("I have 30 seats");
    }
}

