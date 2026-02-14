package numberBasedPrograms;

public class PalindromeNumbers {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println("Your String is palindrome : " + isPalindrome(str));
        
    }

    private static boolean isPalindrome(String string) {
        string.replaceAll("\\s+", "").toLowerCase();
        int first = 0, last = string.length()-1;
        while (first <= last) {
            if (string.charAt(first) != string.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
