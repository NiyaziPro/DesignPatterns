package CreationalDP.SingeltonDP;

public class SingeltonObject {
    public String message = "Hello";

    private static SingeltonObject instance;

    private SingeltonObject() {
    }

    public static SingeltonObject getInstance() {
        if (instance == null) {
            instance = new SingeltonObject();
        }
        return instance;
    }

    public void changeMessage(){
        this.message += " Design Pattern :)";
    }
}
