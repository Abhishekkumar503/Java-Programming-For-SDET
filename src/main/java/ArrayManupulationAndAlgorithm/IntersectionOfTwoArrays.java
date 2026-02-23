package ArrayManupulationAndAlgorithm;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        for(int num : arr1) {
            for(int num2 : arr2) {
                if(num == num2) {
                    System.out.println(num + " : " + num2);
                    break;
                }
            }
        }
    }
}
