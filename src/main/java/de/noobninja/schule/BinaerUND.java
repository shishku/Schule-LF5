package de.noobninja.schule;

import java.util.Arrays;
import java.util.Scanner;

public class BinaerUND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Term1?: ");
        String num1 = scanner.nextLine();
        System.out.print("Term2?: ");
        String num2 = scanner.nextLine();
        String result = "";
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        int length = Math.min(num1.length(), num2.length());
        for (int i = 0 ; i < length ; i++)
        {
            int temp = Integer.parseInt(Character.toString(num1.charAt(i))) & Integer.parseInt(Character.toString(num2.charAt(i)));
            result = temp + result ;
        }
        result = num1.substring( length - 1, num1.length() - 1) + result;
        result = num2.substring(length - 1, num2.length() - 1) + result;
        System.out.println(result);
    }
}
