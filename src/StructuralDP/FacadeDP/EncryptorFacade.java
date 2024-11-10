package StructuralDP.FacadeDP;

public class EncryptorFacade {

    private AES_Encrypt aesEncrypt = new AES_Encrypt();
    private SHA_Encrypt shaEncrypt = new SHA_Encrypt();
    private MD5_Encrypt md5Encrypt = new MD5_Encrypt();

    public void encrypt(String text, EncryptorType type) {
        switch (type) {
            case AES:
                aesEncrypt.encrypt(text);
                break;
            case SHA:
                shaEncrypt.encrypt(text, "Encrypt");
                break;
            case MD5:
                md5Encrypt.encrypt(text, "Encrypt", true);
                break;

        }
    }
}
