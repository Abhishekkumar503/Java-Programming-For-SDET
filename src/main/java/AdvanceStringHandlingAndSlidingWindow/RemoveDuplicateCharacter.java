package AdvanceStringHandlingAndSlidingWindow;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        
        String str = "programming";
        System.out.println("After removing the duplicate character : " + removeDuplicate(str));
        
    }

    private static String removeDuplicate(String str) {
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for(Character c : str.toCharArray()) {
            if(!seen[c]) {
                seen[c] = true;
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

/**
 * Output : After removing the duplicate character : progamin
 */
