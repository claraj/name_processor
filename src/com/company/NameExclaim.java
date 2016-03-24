package com.company;

/**
 * Created by we4954cp on 3/24/2016.
 */
public class NameExclaim implements NameProcessor {

    public void process(String name) {
        System.out.println(name + "!!!!!!");
    }

    public void notUsedHere(int x) {
        System.out.println(x);
    }

    public int countLetters(String name) {
        return name.length();
    }

}
