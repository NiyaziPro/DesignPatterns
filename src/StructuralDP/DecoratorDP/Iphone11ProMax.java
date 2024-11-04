package StructuralDP.DecoratorDP;

import static CreationalDP.AbstractFactoryDP.Color.RESET;
import static CreationalDP.AbstractFactoryDP.Color.YELLOW;

public class Iphone11ProMax extends Iphone11Pro {

    public Iphone11ProMax(Iphone basicPhone) {
        super(basicPhone);
    }

    public String addColor() {
        return YELLOW + "GOLD" + RESET;
    }

    @Override
    public String getModel() {
        return super.getModel() + " Max";
    }
}
