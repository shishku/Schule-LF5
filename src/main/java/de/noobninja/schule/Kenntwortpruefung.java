package de.noobninja.schule;

import java.util.Scanner;

import static java.lang.Math.max;

public class Kenntwortpruefung {

    public static void main(String[] args) {
        int sicherheitNiveau = 0;
        boolean lengthCheck = false;
        boolean numCheck = false;
        boolean capCheck = false;
        boolean specialCheck = false;
        String specialChars = "!§$%&()=?+*#,;.:-_<>";
        String[] array = {"unsicher", "teilweise unsicher", "teilweise sicher", "sicher"};
        System.out.print("Geben Sie das zu prüfunde Kenntwort ein:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        /*
        if (input.matches(".*\\d.*")) sicherheitNiveau++;
        if (input.matches(".*[A-Z].*")) sicherheitNiveau++;
        if (input.matches(".*[!§$%&()=?+*#,;.:\\-_<>].*")) sicherheitNiveau++;
        */
        if (input.length() >= 7) {
            lengthCheck = true;
            sicherheitNiveau++;
        }
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)) && !numCheck) {
                numCheck = true;
                sicherheitNiveau++;
            }
            if (Character.isUpperCase(input.charAt(i)) && !capCheck) {
                capCheck = true;
                sicherheitNiveau++;
            }
            if (specialChars.contains(input.charAt(i) + "") && !specialCheck) {
                specialCheck = true;
                sicherheitNiveau++;
            }
        }
        System.out.println(array[max(sicherheitNiveau - 1, 0)]);
    }
}
