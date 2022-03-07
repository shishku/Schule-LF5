package de.noobninja.schule;

import java.util.Scanner;
/* LF05 - FIAE-SR/TU-21/22 *** Bedingungen *** Aufgabe Punkte beim Würfelspiel */
public class Wuerfelspiel {
    public static void main(String[] args) {
        String input;
        int score = 0;
        while (true) {
            System.out.print("Was hast du gewürfelt? ");
            input = new Scanner(System.in).nextLine();
            if (input.equals("\\q")) {
                System.out.println("Exiting ...");
                return;
            } else {
                input = input.replaceAll("[^1-6]?", "");
                if (input.equals("") || input.length() > 1)
                    System.out.println("Bitte geben Sie eine Zahl zwischen 1-6 ein oder \\q zum Abbrechen");
                else {
                    int dice = Integer.parseInt(input);
                    if (dice % 2 <= 0)
                        dice = (dice % 6) * 2;
                    score += dice;
                    System.out.println("Du erhälst " + dice + " Punkte! \t***\t Deine Gesamtpunke ist: " + score);
                }
            }
        }
    }
}
