package charcounter;

import java.util.List;

public class CharCounter {
    private long numberOfChars;

    public long countChars(List<Character> characters){

        for (Character character : characters) {
            if(character != ' ' )
                ++numberOfChars;
        }

        return numberOfChars;
    }
}
