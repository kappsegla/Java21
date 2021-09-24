package se.iths.java21.exercises.generics;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.function.Consumer;

public class MyDeque<T> implements Iterable<T> {
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

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return null;
    }

    public void forEach(Consumer<? super T> consumer) {
        var temp = head;

        while (temp != null) {
            consumer.accept(temp.data);
            temp = temp.next;
        }
    }

    public void forEachDesc(Consumer<? super T> consumer) {
        var temp = tail;

        while (temp != null) {
            consumer.accept(temp.data);
            temp = temp.prev;
        }
    }
}

class DNode<T> {
    T data;
    DNode<T> next;
    DNode<T> prev;
}