package charcounter;

import java.util.List;

public class CharCounter {
    private long numberOfChars;
    private long numberOfWords;
    private long numberOfVowels;
    private long numberOfConsonants;

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

    public long countVowels(List<Character> characters) {

        characters
                .forEach(character -> {
                    if ( isVowel(character) ) ++numberOfVowels;
                });

        return numberOfVowels;
    }

    public long countConsonants(List<Character> characters) {

        characters
                .forEach(character -> {
                    if (  Character.isLetter(character) && !isVowel(character) ) ++numberOfConsonants;
                });

        return numberOfConsonants;
    }

    public boolean isVowel(Character character){
        switch (Character.toLowerCase(character)){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
                return false;
        }
    }

    public void resetCounter(){
        numberOfChars = 0;
        numberOfWords = 0;
    }
}
