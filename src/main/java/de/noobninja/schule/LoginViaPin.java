package de.noobninja.schule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginViaPin {
    public static void main(String[] args) {
        ArrayList<String> pins = new ArrayList<>(List.of("123", "234", "345", "456", "567", "678", "789"));
        System.out.print("Geben Sie ein Pin ein!: ");
        String pass = (new Scanner(System.in)).nextLine();
        if (pins.contains(pass))
            System.out.println("Login erfolgreich");
        else
            System.out.println("Login verweigert");
    }
}
