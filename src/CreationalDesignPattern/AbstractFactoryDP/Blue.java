package CreationalDesignPattern.AbstractFactoryDP;

public class Blue implements Color{


    @Override
    public void fill() {
        System.out.println(BLUE+"Painted Blue"+RESET);
    }
}
