package de.noobninja.schule;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class SubnetzKlassenRechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("IP im CIR Format?: ");
        String input = scanner.nextLine();
        int suffix = Integer.parseInt(input.split("[/]")[1]);
        String[] subnet = new String[4];
        StringBuilder octet = new StringBuilder();
        for (int i = 1; i <= 32; i++) {
            if (i <= suffix)
                octet.append("1");
            else
                octet.append("0");
            if (i % 8 == 0) {
                subnet[i / 8 - 1] = binaryToDecimal(octet.reverse().toString());
                octet.delete(0, octet.length());
            }
        }
        System.out.println(String.join(".", subnet));
    }

    public static @NotNull String binaryToDecimal(String value) {
        int result = 0;
        for (int i = 0; i < 8; i++)
            if (value.charAt(i) == '1')
                result += Math.pow(2, i);
        return String.valueOf(result);
    }
}
