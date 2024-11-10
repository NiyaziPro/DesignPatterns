package StructuralDP.ProxyDP;

public class RealClass implements ImageGenerator{

    public String fullpath;
    public String name;

    public RealClass(String fullpath) {
        this.fullpath = fullpath;
        this.name = "image";
        loadImage();
    }

    @Override
    public void showImage() {
        System.out.println(this.name + " showing... path: "+this.fullpath);
    }

    public void loadImage(){
        System.out.println("Image loading...");
    }

    public void changeFormat(){

    }
}
