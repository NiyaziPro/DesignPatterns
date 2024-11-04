package StructuralDP.DecoratorDP;

public class Runner {

    /*
    Decorator Pattern (Structural)
Purpose: Attach additional responsibilities to an object dynamically. It provides a flexible alternative to subclassing for extending functionality.
Use case: When you need to add new behavior to objects without altering their structure.
Example: Adding features like scrollbars, borders, and shadows to windows in a GUI framework.
     */
    public static void main(String[] args) {

        ////////////////////////  Curent Object ////////////////////////////
        Iphone iphone = new Iphone();
        System.out.println("iphone.getName() = " + iphone.getName());
        System.out.println("iphone.getCameraCount() = " + iphone.getCameraCount());
        System.out.println("iphone.getPrice() = " + iphone.getPrice());

        System.out.println("================Decorator Object ==================");
        Iphone11Pro iphone11Pro = new Iphone11Pro(new Iphone());
        System.out.println("iphone11Pro.getName() = " + iphone11Pro.getName());
        System.out.println("iphone11Pro.getModel() = " + iphone11Pro.getModel());
        System.out.println("iphone11Pro.getPrice() = " + iphone11Pro.getPrice());
        iphone11Pro.roundCorner();

        System.out.println("================ Object ==================");
        Iphone11ProMax iphone11ProMax = new Iphone11ProMax(new Iphone());
        System.out.println("iphone11ProMax.getName() = " + iphone11ProMax.getName());
        System.out.println("iphone11ProMax.getPrice() = " + iphone11ProMax.getPrice());
        System.out.println("iphone11ProMax.addColor() = " + iphone11ProMax.addColor());

    }
}
