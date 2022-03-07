package de.noobninja.schule;

import java.util.Objects;
import java.util.Scanner;

/* LF05 - FIAE-SR/TU-21/22 *** Bedingungen *** Aufgabe Brutto Netto Java */
public class BruttoNetto {
    public static void main(String[] args) {
        System.out.print("Geben Sie einen Betrag in Euro ein: ");
        String input;
        do {
            input = new Scanner(System.in).nextLine();
            if (input.equals("\\q")) {
                System.out.println("Exiting ...");
                return;
            } else {
                input = input.replaceAll("[^0-9.]", "");
                if (input.equals(""))
                    System.out.println("Bitte geben Sie einen Betrag ein oder \\q zum Abbrechen");
                if (Double.parseDouble(input) > 0)
                    System.out.println("Bitte geben Sie einen Betrag größer als 0 oder \\q zum Abbrechen");
            }
        } while (Objects.equals(input, "") || Double.parseDouble(input) <= 0);
        System.out.println("Das gesamte Kindergeld beträgt: " + Double.parseDouble(input) * 0.93 + " \u20ac");
    }
}
