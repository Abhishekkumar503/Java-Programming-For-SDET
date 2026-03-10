package SearchingAlgorithm;

public class AllSubStrings {
    public static void main(String[] args) {
        /**
         * TC : O(n3)
         * SC : o(1)
         */
        String str = "abc";

        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
/**
 * a
 * ab
 * abc
 * b
 * bc
 * c
 */