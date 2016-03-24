package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class NameSaver implements NameProcessor {

    public void process(String name) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("name.txt"));
            writer.write(name);
            writer.close();
            System.out.println("Have saved your name to name.txt");
        } catch (IOException e) {
            System.out.println("Sorry, error saving name.");
        }
    }
}
