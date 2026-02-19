package ArraysAndCollections;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5 , 1, 5, 6};

        //By hasSet
        Set<Integer> set = new HashSet<>();
        for(int num : array) {
            if(!set.add(num))
                System.out.println(num + " is duplicate");
        }


    }
}
