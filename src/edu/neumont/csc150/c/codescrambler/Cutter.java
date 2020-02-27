package edu.neumont.csc150.c.codescrambler;

public class Cutter implements StringEncryptor {

    public Cutter() {}

    @Override
    public String toString() {
        return "Cutter";
    }

    @Override
    public String encrypt(String phraseToEncrypt) {
        String firstHalf = phraseToEncrypt.substring(0, phraseToEncrypt.length() / 2);
        String secondHalf = phraseToEncrypt.substring(phraseToEncrypt.length() / 2);
        String fullString = secondHalf + firstHalf;
        return fullString;
    }

    @Override
    public String decrypt(String phraseToDecrypt) {
        int odd = 1;
        String firstHalf;
        String secondHalf;
        if(phraseToDecrypt.length()%2 == odd) {
            firstHalf = phraseToDecrypt.substring(0, phraseToDecrypt.length() / 2 + 1);
            secondHalf = phraseToDecrypt.substring(phraseToDecrypt.length() / 2 + 1);
        }
        else {
            firstHalf = phraseToDecrypt.substring(0, phraseToDecrypt.length() / 2);
            secondHalf = phraseToDecrypt.substring(phraseToDecrypt.length() / 2);
        }
        String repairedString = secondHalf + firstHalf;
        return repairedString;
    }
}
