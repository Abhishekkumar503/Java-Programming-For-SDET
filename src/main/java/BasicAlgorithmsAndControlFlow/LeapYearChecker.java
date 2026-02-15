package BasicAlgorithmsAndControlFlow;

public class LeapYearChecker {
    /**
     *
     * @param args
     * Rule 1. If a year is divisible by 4, it might be leap year
     * Rule 2. But if a year is divisible by 100, it is not leap year
     * Rule 3. If a year is divisible by 400, it will be leap year
     */
    public static void main(String[] args) {
        int year = 2100;
        if(year % 4 == 0){
            if(year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year");
                } else {
                    System.out.println(year + " is not a leap year");
                }
            }
            else System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }

    }
}
