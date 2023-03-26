package first_week;

import java.util.Random;

public class Vehicle {
    private int first;
    private int second;
    private static final Random random = new Random();
    public Vehicle() {
        first = random.nextInt(10);
        second = random.nextInt(100);
    }
}