package se.iths.java21.exercises.generics;

public class MyStack<T> {
    private Node<T> head;

    public void push(T obj){

    }

    public T pop(){
//        if (head == null)
//            return null;
        var temp = head.data;
        head = head.next;
        return temp;
    }

    public T peek(){
        return null;
    }
}

class Node<T> {
    T data;
    Node<T> next;
}