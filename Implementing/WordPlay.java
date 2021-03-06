
/**
 * Write a description of WordPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WordPlay {
    /*
     * checks if inputted character is of type char
     */
    static boolean isVowel(char ch) {
        String[] vowels = {"a","i", "e", "u", "o"};
        /* checks if vowel */
        for(int i = 0; i < vowels.length; i++) {
            if(vowels[i].equalsIgnoreCase(Character.toString(ch))) return true;
        }
        return false;
    }
    
    /*
     *  replaces all vowels in a string with given character
     */
    static String replaceVowels(String phrase, char ch) {
        StringBuilder sb = new StringBuilder(phrase);
        for(int i = 0; i < sb.length(); i++) {
            /* checks if vowel */
            if(isVowel(sb.charAt(i))) {
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }
    /*
     *  replaces all instances of character ch with a symbol depending on the index of character
     */
    static String emphasize(String phrase, char ch) {
        StringBuilder sb = new StringBuilder(phrase);
        for(int i = 0; i < sb.length(); i++) {
            /* finds instances of ch */
            if((sb.charAt(i) == ch)) {
                /* checks if even */
                if(i % 2 == 0) {
                    sb.setCharAt(i, '+');
                } else sb.setCharAt(i, '*');                
            }
        }
        return sb.toString();
    }
    
    public void testWordPlay() {
        System.out.println(replaceVowels("Hello World", '*'));
        System.out.println(emphasize("dna ctgaaactga", 'a'));
    }
}
