package ArrayManupulationAndAlgorithm;

public class CommonElementFinder {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {11, 2, 33, 4, 54, 65, 7, 86, 96};
        
        findCommonElement(arr1,arr2);
        
    }

    private static void findCommonElement(int[] arr1, int[] arr2) {

        for(int i : arr1){
            for(int j : arr2){
                if(i == j){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
