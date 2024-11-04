package CreationalDP.AbstractFactoryDP;

public class Runner {

    public static void main(String[] args) {

        AbstractFactory<Shape01> shapeFactory = FactoryProducer.getFactory("shape");
        Shape01 hexagon = shapeFactory.getObject("hexagon");
        hexagon.draw();

        AbstractFactory <Color> colorFactory = FactoryProducer.getFactory("color");
        Color blue = colorFactory.getObject("blue");
        blue.fill();

        Shape01 triangle = (Shape01) FactoryProducer.getFactory("shape").getObject("triangle");
        triangle.draw();

        Color red = (Color) FactoryProducer.getFactory("color").getObject("red");
        red.fill();

        Shape01 square = (Shape01) FactoryProducer.getFactory("shape").getObject("square");
        square.draw();

        Color green = (Color) FactoryProducer.getFactory("color").getObject("green");
        green.fill();
    }
}
