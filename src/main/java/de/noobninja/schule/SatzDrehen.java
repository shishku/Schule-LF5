package de.noobninja.schule;

import java.util.Scanner;

public class SatzDrehen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den Satz ein: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\s+");
        for (String s : inputArray)
            System.out.print(reverse(s) + " ");
    }

    public static String reverse(String str){
        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1 ; i >= 0  ; i--)
            result.append(str.charAt(i));
        return result.toString();
    }
}
