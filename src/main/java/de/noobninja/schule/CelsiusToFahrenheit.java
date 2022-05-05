package de.noobninja.schule;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) throws URISyntaxException {
        File file = new File(CelsiusToFahrenheit.class.getClassLoader().getResource("files/tempC.txt").toURI());
        String result = "";
        try (Scanner scanner = new Scanner(new FileInputStream(file))) {
            while (scanner.hasNext()) {
                result += scanner.nextLine();
            }
            System.out.println(result);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try(FileWriter output = new FileWriter("src/main/resources/files/tempF.txt", Charset.defaultCharset())) {
            output.write(String.valueOf((Integer.parseInt(result) * 9f / 5) + 32));
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
