package edu.neumont.csc150.c.codescrambler;

import java.io.IOException;

public class TestDriver {
    public static void main(String[] args) throws IOException {

//        Doubler dub = new Doubler();
//        String str = "Hello";
//        String newString = dub.encrypt(str);
//        System.out.println(newString);
//        String newerString = dub.decrypt(newString);
//        System.out.println(newerString);
//
//        Cutter cut = new Cutter();
//        String str = "Wood";
//        String newString = cut.encrypt(str);
//        System.out.println(newString);
//        String newerString = cut.decrypt(newString);
//        System.out.println(newerString);
//
//        VowelReplacer vr = new VowelReplacer();
//        String str = "Ooooooooooooooo looks like I do know how to code    just not case sensitive";
//        String newString = vr.encrypt(str);
//        System.out.println(newString);
//        String newerString = vr.decrypt(newString);
//        System.out.println(newerString);
//
//        ConsonantReplacer cr = new ConsonantReplacer();
//        String str = "Ooooooooooooooo looks like I do know how to code    just not case sensitive";
//        String newString = cr.encrypt(str);
//        System.out.println(newString);
//        String newerString = cr.decrypt(newString);
//        System.out.println(newerString);

        ScramblerController c = new ScramblerController();
        c.run();
    }
}
