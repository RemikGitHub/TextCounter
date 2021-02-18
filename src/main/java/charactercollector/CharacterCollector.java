package charactercollector;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CharacterCollector {


    public static List<Character> getTxtFromConsole(){

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        return getCharCollectorFromString(str);

    }

    public static String getTxtFromFile(String file){

//        Trzeba dopisać!!!!!!!!!
        return "null";
    }

    public static List<Character> getCharCollectorFromString(String str){

        return str
                .chars()
                .mapToObj(e -> (char)e)
                .collect(Collectors.toList());
    }
}
