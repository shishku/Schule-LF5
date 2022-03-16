package de.noobninja.schule;

import java.util.ArrayList;
import java.util.Scanner;

/* LF05 - FIAE-SR/TU-21/22 *** Schleifen *** Aufgabe Primzahlenprüfung */
public class Primzahl {
    public static void main(String[] args) {
        String input;
        ArrayList<Integer> list = new ArrayList<>();
        outerLoop:
        while (true) {
            System.out.print("Geben Sie bitte die zu testende Zahl ein!: ");
            input = new Scanner(System.in).nextLine();
            if (input.equals("\\q")) {
                System.out.println("Exiting ...");
                return;
            } else if (input.equals("\\l")) {
                System.out.println("Deine Eingaben sind: " + list);
            } else {
                input = input.replaceAll("[^0-9]?", "");
                if (input.equals(""))
                    System.out.println(
                            "Bitte geben Sie eine Zahl ein oder \\q zum Abbrechen oder \\l, um deine Eingaben anzusehen");
                else if (Integer.parseInt(input) <= 0)
                    System.out.println(
                            "Bitte geben Sie eine Zahl größer als 0 ein oder \\q zum Abbrechen oder \\l, um deine Eingaben anzusehen");
                else {
                    int value = Integer.parseInt(input);
                    for (int i = 2; i < value / 2 ; i++) {
                        if (value % i == 0) {
                            System.out.println("Die Zahl " + value + " ist keine Primzahl");
                            continue outerLoop;
                        }
                    }
                    System.out.println("Die Zahl " + value + " ist eine Primzahl");
                    list.add(value);
                }
            }
        }
    }
}
