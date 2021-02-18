package main;

import charactercollector.CharacterCollector;
import charcounter.CharCounter;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static CharCounter charCounter;

    public static void main(String[] args) {

        charCounter = new CharCounter();

        charsFromConsole();

        charCounter.resetCounter();

        charsFromFile();

    }

    private static void charsFromConsole(){
        System.out.println("Write text to count:");
        List<Character> charactersFromConsole = CharacterCollector.getCharacterListFromConsole();

        System.out.println("Number of chars: " + charCounter.countChars(charactersFromConsole));
        System.out.println("Number of words: " + charCounter.countWords(charactersFromConsole));
    }

    private static void charsFromFile(){
        System.out.println("Write file to count:");

        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();


        List<Character> charactersFromFile = CharacterCollector.getCharacterListFromFile(file);

        System.out.println("Number of chars: " + charCounter.countChars(charactersFromFile));
        System.out.println("Number of words: " + charCounter.countWords(charactersFromFile));
    }
}
