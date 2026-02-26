package ArrayManupulationAndAlgorithm;

public class ArrayQualityChecker {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] arr2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        boolean isSame = checkArraysQuality(arr1,arr2);
        if (isSame) {
            System.out.println("Same array quality");
        }
        else {
            System.out.println("Different array quality");
        }
    }

    private static boolean checkArraysQuality(int[] arr1, int[] arr2) {

        // check if length of both array are not similar
        if (arr1.length != arr2.length) {
            return false;
        }

        // Check element are matching for both array
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
