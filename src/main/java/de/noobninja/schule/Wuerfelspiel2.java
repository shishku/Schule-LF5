package de.noobninja.schule;

import java.util.Random;

/* LF05 - FIAE-SR/TU-21/22 *** Schleifen *** Aufgabe Würfelspiel */
public class Wuerfelspiel2 {
    public static void main(String[] args) throws InterruptedException {
        int score = 0;
        Random random = new Random();
        for (int i = 1; i < 6; i++) {
            Thread.sleep(1000);
            int dice = random.nextInt(6) + 1;
            score = (dice == 3) ?  0 : score + dice;
            System.out.println(i +" Wurf: Du hast eine " + dice + " gewürfelt. Deine Punktezahl ist " + score);
        }
        System.out.println("Deine Punktezahl beträgt " + score);
    }
}
