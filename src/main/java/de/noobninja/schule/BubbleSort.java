package de.noobninja.schule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> zahlen = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10 ; i++)
            zahlen.add(random.nextInt(100));
        System.out.print("unsortiert: ");
        System.out.println(zahlen);
        for (int i = zahlen.size(); i > 1; i--)
            for (int j = 0; j < i-1; j++)
                if (zahlen.get(j) > zahlen.get(j + 1))
                    Collections.swap(zahlen, j , j + 1);
        //Collections.sort(zahlen);
        System.out.print("nach QSum sortiert: ");
        System.out.println(zahlen);
    }
}
