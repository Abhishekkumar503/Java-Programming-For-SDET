package ArraysAndCollections;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {3,2,24,6,5,1};
        for(int i = 0; i < num.length-1; i++){
            for(int j = 0; j < num.length-i-1; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting Array " +  Arrays.toString(num));
    }
}
