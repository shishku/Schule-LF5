package de.noobninja.schule;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KlassenDurchschnitt {
    public static void main(String[] args) throws URISyntaxException {
        File file = new File("src/main/resources/files/Klasse.csv");
        try(Scanner scanner = new Scanner(file)) {
            ArrayList<Double> notes = new ArrayList<>();
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                notes.add(Double.parseDouble(line.split(";")[1]));
                System.out.println("Lese:" + line);
            }
            double sum = 0.0;
            for(double note : notes){
                sum += note;
            }
            System.out.print("Der Klassendurchschnitt beträgt ");
            System.out.println(sum / notes.size());
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
