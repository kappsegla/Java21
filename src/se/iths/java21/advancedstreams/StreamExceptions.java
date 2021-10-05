package se.iths.java21.advancedstreams;

import se.iths.java21.advancedstreams.monads.CheckedFunction;
import se.iths.java21.advancedstreams.monads.Either;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamExceptions {
    public static void main(String[] args) {
        var stream = Stream.of("1", "2", "3", "4", "5", "6", "a", "b", "c");

        long i = stream.map(Either.lift(s -> parser(s)))
                .peek(System.out::println)
                .filter(Either::isRight)
                .map(Either::getRight)
                .mapToInt(o-> o.orElse(0))
              //  .peek(System.out::println)
                .sum();
        System.out.println(i);
    }

    private static int wrapper(String s) {
        try {
            return parser(s);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }


    public static <T, R> Function<T, R> wrap(CheckedFunction<T, R> checkedFunction) {
        return t -> {
            try {
                return checkedFunction.apply(t);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }


    public static Integer parser(String s) throws Exception {
        return Integer.parseInt(s);
    }
}
