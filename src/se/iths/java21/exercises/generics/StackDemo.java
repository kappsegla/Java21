package se.iths.java21.exercises.generics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //LIFO - Last In First Out - Stack
        //FIFO - First In First Out - Queue
        Stack<String> stackTest = new Stack<>();

        stackTest.push("Patrik");
        stackTest.push("Martin");
        stackTest.push("Maria");

        System.out.println(stackTest.peek());
        System.out.println(stackTest.pop());
        System.out.println(stackTest.pop());
        System.out.println(stackTest.pop());

        Deque<Integer> stack = new ArrayDeque<Integer>();

        boolean sucess = stack.offer(1);
        stack.push(2);
        stack.addFirst(3);

        System.out.println(stack.removeFirst());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
