package StructuralDP.FacadeDP;

import static CreationalDP.AbstractFactoryDP.Color.*;

public class SHA_Encrypt {

    public void encrypt(String text, String key) {
        System.out.println(CYAN + "<SHA>" + text +" "+ key + "<SHA/>" + RESET);
    }
}
