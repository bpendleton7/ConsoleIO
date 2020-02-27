package edu.neumont.csc150.c.codescrambler;

public class ConsonantReplacer implements StringEncryptor {

    static String[] replacements = new String[] {
            "a", "c", "d", "f", "e", "g", "h", "j", "i", "k", "l", "m", "n", "p", "o", "q", "r", "s", "t", "v", "u",
            "w", "x", "y", "z", "b"
    };

    static String[] returns = new String[] {
            "a", "z", "b", "c", "e", "d", "f", "g", "i", "h", "j", "k", "l", "m", "o", "n", "p", "q", "r", "s", "u",
            "t", "v", "w", "x", "y"
    };

    public ConsonantReplacer() {}

    @Override
    public String toString() {
        return "Consonant Replacer";
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
