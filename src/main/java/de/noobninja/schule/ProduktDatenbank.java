package de.noobninja.schule;

import java.security.KeyPair;
import java.util.*;

public class ProduktDatenbank {
    public static void main(String[] args) {
        ArrayList<String> produkte = new ArrayList<>();
        ArrayList<Float> preise = new ArrayList<>();
        while(true){
            System.out.print("Produkt?: ");
            String produkt = (new Scanner(System.in)).nextLine();
            if (!Objects.equals(produkt, "e")) {
                System.out.print("Preis?: ");
                float preis = (new Scanner(System.in)).nextFloat();
                produkte.add(produkt);
                preise.add(preis);
            }
            else break;
        }
        while (true)
        {
            boolean found = false;
            System.out.print("Gesuchtes Produkt?: ");
            String produkt = (new Scanner(System.in)).nextLine();
            if (produkt.equals("e"))
                break;
            for (int i = 0; i < produkte.size(); i++) {
                if (Objects.equals(produkte.get(i), produkt))
                {
                    found = true;
                    System.out.println("Der Preis von " + produkt + " ist " + preise.get(i) + " EUR");
                    break;
                }
            }
            if (!found)
                System.out.println("Das Produkt " + produkt + " kann nicht gefunden werden.");
        }
    }
}
