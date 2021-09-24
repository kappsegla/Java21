package se.iths.java21.exercises.generics;

public class MyStack<T> {
    private Node<T> head;
    private int counter;

    public void push(T obj) {
        Node<T> node = new Node<>();
        node.data = obj;

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
        counter++;
    }

    public T pop() {
        if (head == null)
            throw new IllegalStateException();
        var temp = head.data;
        head = head.next;
        counter--;
        return temp;
    }

    public T peek(){
        return null;
    }

    public int size() {
        return counter;
    }

}

class Node<T> {
    T data;
    Node<T> next;
}