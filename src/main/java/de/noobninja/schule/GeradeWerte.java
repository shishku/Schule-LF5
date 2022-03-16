package de.noobninja.schule;

import java.util.Arrays;
import java.util.Random;

public class GeradeWerte {
    public static void main(String[] args) {
        Random random = new Random();
        int[] zahlen = new int[10];
        for (int i = 0; i < 10; i++) {
            int rand = random.nextInt(100);
            if (rand % 2 != 0)
                rand++;
            zahlen[i] = rand;
        }
        System.out.println(Arrays.toString(zahlen));
    }
}
