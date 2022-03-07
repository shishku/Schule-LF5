package de.noobninja.schule;

import java.util.Objects;
import java.util.Scanner;

/* LF05 - FIAE-SR/TU-21/22 *** Bedingungen *** Aufgabe Kindergeld in Java */
public class Kindergeld {
    public static void main(String[] args) {
        System.out.print("Anzahl der Kinder: ");
        String input;
        do {
            input = new Scanner(System.in).nextLine();
            if (input.equals("\\q")) {
                System.out.println("Exiting ...");
                return;
            } else {
                input = input.replaceAll("[^0-9]", "");
                if (input.equals(""))
                    System.out.println("Bitte geben Sie eine Zahl ein oder \\q zum Abbrechen");
            }
        } while (Objects.equals(input, ""));
        int kinder = Integer.parseInt(input);
        int kindergeld = (kinder > 3) ? (kinder - 3) * 179 + 3 * 154 : kinder * 154;
        System.out.println("Das gesamte Kindergeld beträgt: " + kindergeld + " \u20ac");
    }
}
