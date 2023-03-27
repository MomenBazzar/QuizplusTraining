package designPatterns.factory;

public class Car implements Vehicle {

    @Override
    public void seats() {
        System.out.println("I have 4 seats");
    }
}

