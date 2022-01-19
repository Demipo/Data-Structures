package com.demipo;

import com.demipo.linear.Stack;

public class Main {

    public static void main(String[] args) {
        stackImpl();
    }

    public static void stackImpl(){
        Stack stack = new Stack(10);
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Is stack full? " + stack.isFull());
        stack.push(1);
        stack.push(2);
        System.out.println("2nd element: " + stack.peek(1));
        System.out.println("3rd element: " + stack.peek(2));
        System.out.println("Last element removed: " + stack.pop());
        System.out.println("Peeking 2nd element after removal: " + stack.peek(1));
        System.out.println("Peeking 1st element: " + stack.peek(0));
    }
}
