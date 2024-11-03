package CreationalDesignPattern.AbstractFactoryDP;

public class FactoryProducer {

    public static AbstractFactory getFactory(String select) {
        if (select.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (select.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
