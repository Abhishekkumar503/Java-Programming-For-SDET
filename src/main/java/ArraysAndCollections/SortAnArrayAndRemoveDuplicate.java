package ArraysAndCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortAnArrayAndRemoveDuplicate {
    public static void main(String[] args) {

        /**
         * 1. Sort the Array
         * 2. Remove the duplicate by adding to set collections
         * 3. Convert the result back into Array
         */
        String[] names = {"ABHISHEK", "UDAI", "ARCHIT", "AJAY", "SUNNY", "ABHISHEK"};

        System.out.println("After Sorted an Array and Remove Duplicate");
        Arrays.stream(sortAnArrayAndRemoveDuplicate(names)).forEach(System.out::println);
        
        // by using Collection
        System.out.println("Sorted an Array and Remove Duplicates : " + Arrays.toString(byTreeSet(names)));
    }

    private static String[] byTreeSet(String[] names) {
        Set<String> set = new TreeSet<>();
        for (String name : names) {
            set.add(name);
        }
        String[] array = set.toArray(new String[0]);
        return array;
    }

    public static String[] sortAnArrayAndRemoveDuplicate(String[] names) {

        System.out.println("Initial Array : ");
        Arrays.stream(names).forEach(System.out::println);
        Arrays.sort(names);

        System.out.println("Sorted Array : ");
        Arrays.stream(names).forEach(System.out::println);

        System.out.println();
        //Set Collection to remove duplicates
        Set<String> set = new HashSet<>();
        for(String name : names)
            set.add(name);
        
        return Arrays.stream(names)
                .filter(name -> set.contains(name))
                .distinct()
                .toArray(String[]::new);
    }


}
