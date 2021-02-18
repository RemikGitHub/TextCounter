package charcounter;

import java.util.List;
import java.util.stream.Collectors;

public class CharCounter {
    private long numberOfChars;
    private long numberOfWords;

    public long countChars(List<Character> characters){

        for (Character character : characters) {
            if( !Character.isWhitespace(character) ) ++numberOfChars;
        }

        return numberOfChars;
    }

    public long countWords(List<Character> characters){

        boolean isWord = false;
        int endOfLine = characters.size() - 1;

        for (int i = 0; i < characters.size(); i++) {

            // if the char is a letter, word = true.
            if ( !Character.isWhitespace( characters.get(i) ) && i != endOfLine) {
                isWord = true;

                // if char isn't a letter and there have been letters before,
                // counter goes up.
            } else if ( Character.isWhitespace( characters.get(i) ) && isWord ) {
                numberOfWords++;
                isWord = false;

                // last word of String; if it doesn't end with a non letter, it
                // wouldn't count without this.
            } else if ( !Character.isWhitespace( characters.get(i) ) && i == endOfLine ) {
                numberOfWords++;
            }
        }

        return numberOfWords;
    }

    public void resetCounter(){
        numberOfChars = 0;
        numberOfWords = 0;
    }
}
