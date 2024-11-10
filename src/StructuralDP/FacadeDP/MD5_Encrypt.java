package StructuralDP.FacadeDP;

import static CreationalDP.AbstractFactoryDP.Color.*;

public class MD5_Encrypt {

    public void encrypt(String text, String key, boolean isComplex) {
        if (isComplex){
            System.out.println(PURPLE + "****<MD5>" + text +" "+ key + "<MD5/>****" + RESET);
        }else {
            System.out.println(WHITE + "<MD5>" + text +" "+ key + "<MD5/>" + RESET);
        }

    }
}
