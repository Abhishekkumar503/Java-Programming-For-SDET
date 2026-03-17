package LinearDataStructure;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

// Step 1: Push elements
        stack.push(1);  // Stack: [1]
        stack.push(2);  // Stack: [1, 2]

// Print and size
        stack.forEach(System.out::println);  // Prints: 2, 1 (top to bottom)
        System.out.println(stack.size());     // Prints: 2

// Step 2: Add at first (bottom of stack)
//        stack.addFirst(0);  // Stack: [0, 1, 2]

// Print and size
        stack.forEach(System.out::println);  // Prints: 2, 1, 0
        System.out.println(stack.size());     // Prints: 3

// Step 3: Add at last (top of stack)
//        stack.addLast(3);   // Stack: [0, 1, 2, 3]

// Print and size
        stack.forEach(System.out::println);  // Prints: 3, 2, 1, 0
        System.out.println(stack.size());     // Prints: 4
    }
}
