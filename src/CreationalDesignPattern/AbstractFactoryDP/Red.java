package CreationalDesignPattern.AbstractFactoryDP;

public class Red implements Color{

    @Override
    public void fill() {
        System.out.println(RED+"Painted RED"+RESET);
    }
}
