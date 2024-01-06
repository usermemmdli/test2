package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String yazilacaqFile = "C:/Users/Mustafa/OneDrive - Bureau on ICT for Education, Ministry of Education/Desktop/Java/Test.txt";
        try {
            String yazi = "Hello World";

            File file = new File(yazilacaqFile);
            FileWriter fileWriter = new FileWriter(yazilacaqFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(yazi);
            writer.close();

            System.out.println("File yazıldı");
        } catch (IOException e) {
            System.out.println("File yazma xetasi: " + e.getMessage());
        }
    }
}