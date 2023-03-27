package designPatterns;

public class Main {
    public static void main(String[] args) {
        SingeltonObject single = SingeltonObject.getInstance();
        System.out.println(single);
        single = SingeltonObject.getInstance();
        System.out.println(single);
        single = SingeltonObject.getInstance();
        System.out.println(single);
    }
}
