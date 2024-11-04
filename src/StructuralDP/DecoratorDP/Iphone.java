package StructuralDP.DecoratorDP;

public class Iphone implements Phone{

    @Override
    public String getName() {
        return "Iphone";
    }

    @Override
    public int getCameraCount() {
        return 3;
    }

    @Override
    public int getPrice() {
        return 1000;
    }


}
