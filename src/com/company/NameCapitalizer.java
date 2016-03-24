package com.company;

/**
 * Created by we4954cp on 3/24/2016.
 */
public class NameCapitalizer implements NameProcessor{

    public void process(String name) {
        System.out.println("here is your name in uppercase :" + name.toUpperCase());
    }

}
