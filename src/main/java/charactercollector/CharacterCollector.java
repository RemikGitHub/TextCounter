package charactercollector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharacterCollector {


    public static List<Character> getCharacterListFromConsole(){

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        return getCharCollectorFromString(str);

    }

    public static List<Character> getCharacterListFromFile(String file){

        List<Character> characters = new LinkedList<>();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;

            while ( (line = bufferedReader.readLine()) != null) {
                characters.addAll(getCharCollectorFromString(line));
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
        catch (IOException e) {
            System.out.println("Input, Output Error!");
        }
        return characters;
    }

    public static List<Character> getCharCollectorFromString(String str){

        return str
                .chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toList());
    }
}
