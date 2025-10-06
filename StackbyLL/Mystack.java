package com.test.stack;

import java.util.Stack;

public class Mystack {

    public static void main(String[] args) {
        // Using Java's built-in Stack
        Stack<Integer> s = new Stack<>();

        // Push elements
        System.out.println("Entering the values in Stack:");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        // Display elements
        System.out.println("Stack elements: " + s);

        // Pop an element
        System.out.println("Popped element: " + s.pop());

        // Peek top element
        System.out.println("Top element is: " + s.peek());

        // Check if stack is empty
        System.out.println("Is Stack empty? " + (s.isEmpty() ? "Yes" : "No"));
       // Get the size of the stack
        System.out.println("Size of Stack now: " + s.size());
    }
}
   //using the inbuilt funcions as we are using 
// Stack<Integer>s= new Stack<>();
