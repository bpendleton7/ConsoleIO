package edu.neumont.csc150.c.codescrambler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ScramblerController {

    private static Random rand = new Random();

    private List<StringEncryptor> encryptors = new ArrayList<>();
    private ScramblerView ui = new ScramblerView();
    private StringEncryptor doubler = new Doubler();
    private StringEncryptor cutter = new Cutter();
    private StringEncryptor vowelReplacer = new VowelReplacer();
    private StringEncryptor consonantReplacer = new ConsonantReplacer();
    private String str;

    public void run() throws IOException {
        boolean userRequestedExit = false;
        while (!userRequestedExit) {
            ui.displayMainMenu();
            int selection = ui.getUserSelection(0, 7);
            switch (selection) {
                case 0:
                    System.out.println("Toodles");
                    userRequestedExit = true;
                    break;
                case 1:
                    addEncryptor();
                    break;
                case 2:
                    for(int i = 0; i< encryptors.size(); i++) {
                        System.out.println(encryptors.get(i).toString());
                    }
                    break;
                case 3:
                    encryptors.clear();
                    break;
                case 4:
                    stringToBeEncrypted();
                    break;
                case 5:
                    for(int i = 0; i < encryptors.size(); i++) {
                        str = encryptors.get(i).encrypt(str);
                    }
                    break;
                case 6:
                    for(int i = encryptors.size()-1; i >= 0; i--) {
                        str = encryptors.get(i).decrypt(str);
                    }
                    break;
                case 7:
                    ui.displayPrompt(str);
                    break;
                default:
                    System.out.println("I didn't expect " + selection + ". You should pick a number between 0-7");
            }
        }
    }

    private void addEncryptor() throws IOException {
        boolean userRequestedExit = false;
        while (!userRequestedExit) {
            ui.displayEncryptorMenu();
            int selection = ui.getUserSelection(0, 4);
            switch (selection) {
                case 0:
                    userRequestedExit = true;
                    break;
                case 1:
                    encryptors.add(doubler);
                    for(int i = 0; i< encryptors.size(); i++) {
                        System.out.println(encryptors.get(i).toString());
                    }
                    break;
                case 2:
                    encryptors.add(cutter);
                    for(int i = 0; i< encryptors.size(); i++) {
                        System.out.println(encryptors.get(i).toString());
                    }
                    break;
                case 3:
                    encryptors.add(vowelReplacer);
                    for(int i = 0; i< encryptors.size(); i++) {
                        System.out.println(encryptors.get(i).toString());
                    }
                    break;
                case 4:
                    encryptors.add(consonantReplacer);
                    for(int i = 0; i< encryptors.size(); i++) {
                        System.out.println(encryptors.get(i).toString());
                    }
                    break;
                default:
                    System.out.println("I didn't expect " + selection + ". You should pick a number between 0-4");
            }
        }
    }

    private String stringToBeEncrypted() throws IOException {
        ui.displayPrompt("Enter input");
        str = ui.getStringInput();
        return str;
    }
}
