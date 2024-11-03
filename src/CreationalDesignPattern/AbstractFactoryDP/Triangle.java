package CreationalDesignPattern.AbstractFactoryDP;

/*public*/ class Triangle implements Shape01 {


    private String name;
    private int angle;
    private int edge;

    public Triangle(String name, int angle, int edge) {
        this.name = name;
        this.angle = angle;
        this.edge = edge;
    }


    @Override
    public void draw() {
        System.out.println(this.name + " drawn. Angle : " + this.angle + " Edge : " + this.edge);
    }
}
