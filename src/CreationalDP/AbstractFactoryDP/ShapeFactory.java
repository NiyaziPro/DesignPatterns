package CreationalDP.AbstractFactoryDP;

public class ShapeFactory implements AbstractFactory<Shape01>{

    @Override
    public Shape01 getObject(String objectType) {
        return getShape(objectType);
    }

    public static Shape01 getShape(String type) {
        if (type.equalsIgnoreCase("triangle")) {
            return new Triangle("Triangle", 60, 3);
        } else if (type.equalsIgnoreCase("square")) {
            return new Square("Square", 90, 4);
        } else if (type.equalsIgnoreCase("hexagon")) {
            return new Hexagon("Hexagon", 120, 6);
        }
        return null;

    }


}
