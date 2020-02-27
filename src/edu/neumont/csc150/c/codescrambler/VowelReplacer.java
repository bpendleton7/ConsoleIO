package edu.neumont.csc150.c.codescrambler;

public class VowelReplacer implements StringEncryptor {

    static String[] replacements = new String[] {
            "e", "b", "c", "d", "i", "f", "g", "h", "o", "j", "k", "l", "m", "n", "u", "p", "q", "r", "s", "t", "a",
            "v", "w", "x", "y", "z"
    };

    static String[] returns = new String[] {
            "u", "b", "c", "d", "a", "f", "g", "h", "e", "j", "k", "l", "m", "n", "i", "p", "q", "r", "s", "t", "o",
            "v", "w", "x", "y", "z"
    };

    public VowelReplacer() {}

    @Override
    public String toString() {
        return "Vowel Replacer";
    }

    @Override
    public String encrypt(String phraseToEncrypt) {

        StringBuilder encrypted = new StringBuilder();

        for(int i = 0; i < phraseToEncrypt.length(); i++){
            char ch = phraseToEncrypt.charAt(i);
            if (ch == ' ') {
                encrypted = encrypted.append(" ");
                continue;
            }
            int idx = Character.getNumericValue(ch) - 10;
            encrypted = encrypted.append(replacements[idx]);
        }
        return encrypted.toString();
    }

    @Override
    public String decrypt(String phraseToDecrypt) {

        StringBuilder decrypted = new StringBuilder();

        for(int i = 0; i < phraseToDecrypt.length(); i++){
            char ch = phraseToDecrypt.charAt(i);
            if (ch == ' ') {
                decrypted = decrypted.append(" ");
                continue;
            }
            int idx = Character.getNumericValue(ch) - 10;
            decrypted = decrypted.append(returns[idx]);
        }
        return decrypted.toString();
    }
}
