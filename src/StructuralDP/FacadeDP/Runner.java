package StructuralDP.FacadeDP;

public class Runner {

    /*
     Facade Pattern (Structural)
Purpose: Provide a unified interface to a set of interfaces in a subsystem, making it easier to use the subsystem.
Use case: Simplifying a complex library or framework by providing a more straightforward API.
Example: A hotel management system that provides a simple API for booking, check-in, and billing without exposing underlying subsystems.
     */
    public static void main(String[] args) {

        String text = "Design Pattern";

        AES_Encrypt aesEncrypt = new AES_Encrypt();
        aesEncrypt.encrypt(text);

        SHA_Encrypt shaEncrypt = new SHA_Encrypt();
        shaEncrypt.encrypt(text,"Encrypt");

        MD5_Encrypt md5Encrypt = new MD5_Encrypt();
        md5Encrypt.encrypt(text,"Encrypt",true);
        md5Encrypt.encrypt(text,"Encrypt",false);

        ///////////////////////////////////////////////////////////////////

        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text,EncryptorType.AES);
        encryptorFacade.encrypt(text,EncryptorType.SHA);
        encryptorFacade.encrypt(text,EncryptorType.MD5);


    }
}
