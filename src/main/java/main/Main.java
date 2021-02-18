package main;

import charactercollector.CharacterCollector;
import charcounter.CharCounter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Write text to count:");
        CharCounter charCounter = new CharCounter();
        System.out.println(charCounter.countChars(CharacterCollector.getTxtFromConsole()));

    }
}
