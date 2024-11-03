package CreationalDesignPattern.AbstractFactoryDP;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println(GREEN + "Painted GREEN" + RESET);
    }
}