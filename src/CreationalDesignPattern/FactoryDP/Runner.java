package CreationalDesignPattern.FactoryDP;

public class Runner {
    /*
Factory Method Pattern (Creational)
Purpose: Define an interface for creating an object but let subclasses alter the type of objects that will be created.
Use case: When a class can't anticipate the class of objects it must create, or when it wants to delegate the responsibility of creating objects to its subclasses.
Example: A document editor that supports multiple file types (PDF, DOCX, etc.) where each file type has its own creation process.

 Factory Method Pattern (Erzeugungsmuster)
Zweck: Definieren einer Schnittstelle zur Objekterstellung, wobei die Unterklassen die Art der zu erstellenden Objekte verändern können.
Anwendungsfall: Wenn eine Klasse die Art der zu erstellenden Objekte nicht im Voraus kennen kann oder die Verantwortung für die Objekterstellung an Unterklassen delegieren möchte.
Beispiel: Ein Dokumenteneditor, der mehrere Dateitypen unterstützt (z.B. PDF, DOCX), wobei jeder Dateityp seinen eigenen Erstellungsprozess hat.
 */

    public static void main(String[] args) {

        Shape01 triangle = new Triangle("Triangle", 60, 3);
        triangle.draw();

        Shape01 square = new Square("Square", 90, 4);
        square.draw();

        Shape01 hexagon = new Hexagon("Hexagon", 120, 6);
        hexagon.draw();

        System.out.println("============================================");

        Shape01 shape1 = ShapeFactory.getShape(ShapeType.TRIANGLE);
        shape1.draw();

        Shape01 shape2 = ShapeFactory.getShape(ShapeType.SQUARE);
        shape2.draw();

        Shape01 shape3 = ShapeFactory.getShape(ShapeType.HEXAGON);
        shape3.draw();

    }

}
