package ArrayManupulationAndAlgorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

public class RemoveElementsGreaterThanGivenValue {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(15);
        arr.add(23);
        arr.add(31);
        arr.add(14);
        arr.add(54);
        arr.add(32);

        arr.stream().forEach(System.out::println);
        System.out.println();

        //remove the elem when array number greater than target number
        int target = 31;

        // Approach 1
        arr.removeIf(x -> x > target);
        arr.stream().forEach(System.out::println);
        System.out.println();

        //Approach 2
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() >= target) {
                iterator.remove();  // Safe removal
            }
        }

        arr.stream().forEach(System.out::println);
    }
}
