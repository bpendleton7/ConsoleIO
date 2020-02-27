package edu.neumont.csc150.c.codescrambler;

public class Doubler implements StringEncryptor {

    public Doubler() {}

    @Override
    public String toString() {
        return "Doubler";
    }

    @Override
    public String encrypt(String phraseToEncrypt) {
        phraseToEncrypt += phraseToEncrypt;
        return phraseToEncrypt;
    }

    @Override
    public String decrypt(String phraseToDecrypt) {
        String decrypted = phraseToDecrypt.substring(phraseToDecrypt.length() / 2);
        return decrypted;
    }
}
