package reflection;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Field[] fields = vehicle.getClass().getDeclaredFields();
        for (Field field :
                fields) {
            System.out.println(field.getName());
        }
    }
}

