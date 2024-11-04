package CreationalDP.FactoryDP_test;

import CreationalDP.FactoryDP.Shape01;
import CreationalDP.FactoryDP.ShapeFactory;
import CreationalDP.FactoryDP.ShapeType;
//import CreationalDesignPattern.FactoryDP.Square;


public class FactoryDPRunner {
    public static void main(String[] args) {

        // Square square = new Square();

        Shape01 square = ShapeFactory.getShape(ShapeType.SQUARE);
        square.draw();

    }
}
