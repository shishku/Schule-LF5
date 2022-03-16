package de.noobninja.schule;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Lottozahlen {
    public static void main(String[] args) {
        ArrayList<Integer> zahlen = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 5; i++) {
            int rand = random.nextInt(49) + 1;
            if (zahlen.contains(rand))
                i--;
            else
                zahlen.add(rand);
        }
        System.out.println(zahlen);
    }
}
