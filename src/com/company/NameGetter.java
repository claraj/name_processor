package com.company;

import java.util.Scanner;

public class NameGetter {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");

        String name = scanner.nextLine();

        //NameProcessor nameProcessor = new NameCapitalizer();
        NameProcessor nameProcessor = new NameSaver();

        nameProcessor.process(name);  //todo

        scanner.close();

    }
}
