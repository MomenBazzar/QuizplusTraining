package designPatterns.factory;

public class Van implements Vehicle {

    @Override
    public void seats() {
        System.out.println("I have 9 seats");
    }
}
