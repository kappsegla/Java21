package se.iths.java21.collections;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        //Add to the end O(n)
        stringList.add("First");
        stringList.add("Second");
        //Find by index  O(1)
        stringList.get(1);
        //Insert O(n)
        stringList.add(0,"Zero");
        //Remove/Delete O(n)
        stringList.remove(0);
        //Search O(n)
        stringList.indexOf("First");

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(6);
        integerList.add(6);
        integerList.add(5);
        integerList.add(4);
        integerList.add(4);
        integerList.add(1);

        integerList.forEach(System.out::println);

        var set = Set.copyOf(integerList);

        Set<Integer> integers = new HashSet<>();

        integers.add(1);
        integers.add(10);
        integers.add(4);
      //  integers.forEach(System.out::println);
        integers.add(5);
       // integers.forEach(System.out::println);
    }
}
