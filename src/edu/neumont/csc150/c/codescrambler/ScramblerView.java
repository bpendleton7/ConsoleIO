package edu.neumont.csc150.c.codescrambler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScramblerView {

    private BufferedReader userIn;

    public ScramblerView() {
        userIn = new BufferedReader(new InputStreamReader(System.in));
    }

    public int getUserSelection(int min, int max) throws IOException {
        String rawInput = userIn.readLine();
        int input = Integer.parseInt(rawInput);
        return input;
    }

    public void displayMainMenu() throws IOException {
        System.out.println("1 - Add an encryptor\r\n" + "2 - View encryption list\r\n" + "3 - Clear encryption list\r\n" +
                "4 - Enter input to be encrypted\r\n" + "5 - Encrypt input\r\n" + "6 - Decrypt encryption\r\n" +
                "7 - View input in current encryption state\r\n" + "0 - Exit");
    }

    public void displayEncryptorMenu() throws IOException {
        System.out.println("1 - Add Doubler Encryptor\r\n" + "2 - Add Cutter Encryptor\r\n" + "3 - Add Vowel-Replacer Encryptor\r\n" +
                "4 - Add Consonant-Replacer Encryptor\r\n" + "0 - Return to Main Menu");
    }

    public void displayPrompt(String prompt) {
        System.out.println(prompt);
    }

    public String getStringInput() throws IOException {
        return userIn.readLine();
    }
}
