package StringHandlingProgramme;

import java.util.HashSet;
import java.util.Set;

public class CheckIfStringIsPangram {
    public static void main(String[] args) {
        /**
         * Pangrm : if a sentence contail all 26 letters then it's called pangram.
         */

        String str = "The quick brown fox jumps over the lazy dog";

        if (isPangram(str)) System.out.println(str + " is a Pangram");
        else  System.out.println(str + " is not a Pangram");
    }

    private static boolean isPangram(String str) {
        // change string into lower case
        str = str.toLowerCase();

        // initalize the set to store unique char
        Set<Character> charsSet = new HashSet<Character>();

        //Inserting sentence char in to Set
        for(Character character : str.toCharArray()) {
            if(character >= 'a' && character <= 'z') {
                charsSet.add(character);
            }
        }

        // IF set Contain all 26 letters then it is Pangram
//        for(int i = 'a'; i <= 'z' ;i++) {
//            if(!charsSet.contains((char) i ))
//                return false;
//        }
//        return true;

        return charsSet.size() == 26;
    }
}
