package CreationalDesignPattern.FactoryDP_test;

import CreationalDesignPattern.FactoryDP.Shape01;
import CreationalDesignPattern.FactoryDP.ShapeFactory;
import CreationalDesignPattern.FactoryDP.ShapeType;
//import CreationalDesignPattern.FactoryDP.Square;

import java.awt.*;

public class FactoryDPRunner {
    public static void main(String[] args) {

        // Square square = new Square();

        Shape01 square = ShapeFactory.getShape(ShapeType.SQUARE);
        square.draw();

    }
}
