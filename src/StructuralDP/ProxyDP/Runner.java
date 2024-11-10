package StructuralDP.ProxyDP;


import static CreationalDP.AbstractFactoryDP.Color.*;

public class Runner {

    public static void main(String[] args) {


        RealClass realObject = new RealClass("C:\\image1.jpeg");
        System.out.println(BLUE + "Name : " + realObject.name + RESET);

        ///////////////////////////////////////////////////////////////////////
        ProxyClass proxyObject = new ProxyClass("C:\\image2.jpeg");
        System.out.println(BG_BRIGHT_BLUE + BLACK + "Fullpath = " + proxyObject.fullpath + RESET);
        proxyObject.showImage();

    }
}
