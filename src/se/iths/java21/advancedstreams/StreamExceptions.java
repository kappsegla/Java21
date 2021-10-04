package se.iths.java21.advancedstreams;

import java.util.stream.Stream;

public class StreamExceptions {
    public static void main(String[] args) {
        var stream = Stream.of("1", "2", "3", "4", "5", "6", "a", "b", "c");

        long i = stream.mapToInt(s -> {
                    try {
                        return Integer.parseInt(s);
                    } catch (Exception e) {
                        return 0;
                    }
                })
                .peek(System.out::println)
                .sum();
        System.out.println(i);
    }
}
