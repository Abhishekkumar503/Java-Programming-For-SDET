package TwoPointerTechnique;

public class TwoPointerPairSum {
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,3};
        int target = 10;

        for(int i : arr){
            for(int j : arr){
                if(i + j == target){
                    System.out.println(i + " + " + j);
                }
            }
        }
        System.out.println();

        //Using two Pointer
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.println(arr[left] + " + " + arr[right]);
            }
            if(sum < target){
                left++;
            }
            else
                right--;
        }


    }
}
