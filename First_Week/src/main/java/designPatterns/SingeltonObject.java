package designPatterns;

public class SingeltonObject {
    private static SingeltonObject singleObject = new SingeltonObject();

    private SingeltonObject() {
    }

    public static SingeltonObject getInstance() {
        return singleObject;
    }
}
