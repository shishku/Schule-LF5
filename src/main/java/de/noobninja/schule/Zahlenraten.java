package de.noobninja.schule;

import java.util.Random;
import java.util.Scanner;

/* LF05 - FIAE-SR/TU-21/22 *** Schleifen *** Aufgabe Zahlenraten */
public class Zahlenraten {
    public static void main(String[] args)  {
        int zahl;
        int counter = 0;
        Random random = new Random();
        int number = random.nextInt(100);
        while (true) {
            System.out.print("Rate meine Zahl!(-1 f. Ende): ");
            zahl = new Scanner(System.in).nextInt();
            if (zahl == -1) {
                System.out.println("Exiting ...");
                return;
            } else {
                if (zahl < 0)
                    System.out.println("Bitte geben Sie eine Zahl zwischen 0-99 ein oder -1 zum Abbrechen");
                else {
                    counter++;
                    if (zahl > number)
                        System.out.println("Meine Zahl ist kleiner!");
                    else if (zahl < number)
                        System.out.println("Meine Zahl ist größer!");
                    else {
                        number = random.nextInt(100);
                        System.out.println("RICHTIG, Du brauchtest " + counter + " Versuche!");
                        counter = 0;
                    }
                }
            }
        }
    }
}
