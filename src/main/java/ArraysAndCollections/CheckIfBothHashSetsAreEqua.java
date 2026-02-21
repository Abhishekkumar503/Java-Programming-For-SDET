package ArraysAndCollections;

import java.util.HashSet;

public class CheckIfBothHashSetsAreEqua {
    public static void main(String[] args) {
        //HashSet1
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Ben");
        hashSet.add("Kevin");
        hashSet.add("Gwein");
        hashSet.add("Max");
        System.out.println("HashSet" + hashSet);

        //HashSet2
        HashSet<String> hashSet2 = new  HashSet<>();
        hashSet2.add("Ben");
        hashSet2.add("Kevin");
        hashSet2.add("Gwein");
        hashSet2.add("Max");
        hashSet2.add("Ashmath");
        System.out.println("HashSet2" + hashSet2);

        // checking if both HashSet is Equals
        System.out.println("HashSet is equals to HashSet2 : " + hashSet.equals(hashSet2));
    }
}
