package CreationalDesignPattern.FactoryDP;

public class ShapeFactory {

    public static Shape getShape(ShapeType type) {
        if (type == ShapeType.TRIANGLE) {
            return new Triangle("Triangle", 60, 3);
        } else if (type == ShapeType.SQUARE) {
            return new Square("Square", 90, 4);
        } else if (type == ShapeType.HEXAGON) {
            new Hexagon("Hexagon", 120, 6);
        }
        return null;
    }
}
