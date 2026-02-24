package ArrayManupulationAndAlgorithm;

public class LinearSeach {
    /**
     * Search An Element In An Array Using Linear Search
     */
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,6,2,7,8,9,11,43,2};
        int target = 12;

        if(linearSearch(arr,target) >= 0)
        System.out.println("Your target value is exist in array at index : " + linearSearch(arr,target));
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
