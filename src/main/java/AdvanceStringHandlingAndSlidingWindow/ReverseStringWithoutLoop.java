package AdvanceStringHandlingAndSlidingWindow;

public class ReverseStringWithoutLoop {
    public static void main(String[] args) {
        String str = "Interview";
        System.out.println("original string: " + str);
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        System.out.println("reversed string: " + builder.toString());
        System.out.println("reversed string: " + reverseString(str));
    }

    private static String reverseString(String str) {
        if(str == null || str.length() == 1 || str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
