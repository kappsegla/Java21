package se.iths.java21.generics;

import java.util.function.Predicate;

public class OldStyle<T> {
    private T data;

    public void store(T o){

        data = o;
    }

    public T retrive(){
        return data;
    }

    public static void main(String[] args) {
        OldStyle<String> oldStyle = new OldStyle<>();
        OldStyle<Integer> oldStyle1 = new OldStyle<>();
        String s = "Hello";
        Integer i =1; //Auto boxing

        i = i + 1;  //Auto unboxing and boxing of result

        oldStyle.store(s);
        oldStyle1.store(i);
        String r = oldStyle.retrive();
        Integer ri = oldStyle1.retrive();
        System.out.println(r);
    }
}
