package LinearDataStructure;

import java.util.LinkedList;

public class AddElemToBothEndOfLinkedList
{
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Uttar Pradesh");
        cities.stream().forEach(System.out::println);
        System.out.println(cities.size());

        // add elem to start
        cities.addFirst("Kolkata");
        cities.stream().forEach(System.out::println);
        System.out.println(cities.size());

        // add at last
        cities.addLast("Uttarkhand");
        cities.stream().forEach(System.out::println);
        System.out.println(cities.size());

    }
}
