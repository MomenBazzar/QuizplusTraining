package designPatterns.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(Rounded rounded) {
        if (rounded == Rounded.TRUE) {
            return new RoundedShapeFactory();
        } else {
            return new ShapeFactory();
        }
    }
}
