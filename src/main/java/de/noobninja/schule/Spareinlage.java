package de.noobninja.schule;

// Endkapital = Anfangskapital * (1 + Zinssatz in Prozent 5% = 0.05) ^ Laufzeit
// formula ---> x ^ y = z  **** y = log x (z) ***** y = log10(z) / log10(x)

import java.util.Scanner;

import static java.lang.Math.ceil;
import static java.lang.Math.log;

/* LF05 - FIAE-SR/TU-21/22 *** Schleifen *** Aufgabe Spareinlage */
public class Spareinlage {
    public static void main(String[] args) {
        int einlage;
        int zinssatz;
        System.out.print("Spareinlage?: ");
        einlage = new Scanner(System.in).nextInt();
        System.out.print("Zinssatz?: ");
        zinssatz = new Scanner(System.in).nextInt();
        System.out.println("Es dauert " + (int)ceil(log(2) / log(zinssatz * 0.01 + 1)) + " Jahre, bis sich eine Einlage von " +
                                 einlage +" bei einem Zinssatz von " + zinssatz + "% verdoppelt hat.");
    }
}
