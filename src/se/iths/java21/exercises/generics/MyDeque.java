package se.iths.java21.exercises.generics;

public class MyDeque<T> {
    private DNode<T> head;
    private DNode<T> tail;
    private int counter;

    public void push(T obj) {
        DNode<T> node = new DNode<>();
        node.data = obj;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        counter++;
    }

    public T pop() {
        if (head == null)
            throw new IllegalStateException();
        var temp = head.data;
        head = head.next;

        if (head != null)
            head.prev = null;
        else
            tail = null;

        counter--;
        return temp;
    }

    public T peek() {
        return head.data;
    }

    public int size() {
        return counter;
    }

    public void forEach() {
        var temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void forEachDesc() {
        var temp = tail;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}

class DNode<T> {
    T data;
    DNode<T> next;
    DNode<T> prev;
}