package se.iths.java21.collections;

import java.util.*;

public class SetVsMap {
    public static void main(String[] args) {

        Set<String> strings = new HashSet<>(List.of("a", "b", "c"));

        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("a","a");
        dictionary.put("b","b");
        dictionary.put("c","c");

        boolean answer = strings.contains("a");
        boolean answer2 = dictionary.containsKey("a");


    }
}
