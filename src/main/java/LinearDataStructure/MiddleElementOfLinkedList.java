package LinearDataStructure;

import java.util.LinkedList;

public class MiddleElementOfLinkedList {
    public static void main(String[] args) {

        // Step : 1 Create Linked List
        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        int middle = getMiddle(linkedList);
        System.out.println("Middle: " + middle);
    }

    private static int getMiddle(LinkedList<Integer> linkedList) {
        if (linkedList == null || linkedList.isEmpty()) {
            return -1;
        }
        return linkedList.get((linkedList.size() - 1) / 2); // Add -1 because LinkedList Pointing from 0 index
    }
}
