package se.iths.java21.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        String returnedInfo = sometimes(1);

        if (returnedInfo != null)
            returnedInfo.startsWith("G");

        Optional<String> info = sometimesAlways(2);
        info.ifPresent(System.out::println);
        info.ifPresentOrElse(System.out::println, () -> System.out.println("The optional was empty"));

        List<String> result = searchForProducts("Martin");
        if( result.size() == 0)
            System.out.println("Nothing found");
    }

    public static String sometimes(int value) {
        if (value % 2 == 0)
            return "Good";
        return null;
    }

    public static Optional<String> sometimesAlways(int value) {
        if (value % 2 == 0)
            return Optional.of("Good");
        return Optional.empty();
    }

    //No need for Optional, just return empty List
    public static List<String> searchForProducts(String productName){
        return new ArrayList<>();
    }

    //When returning just one object, use Optional if we need to return not found cases.
    public static Optional<String> findProduct(int id){
        return Optional.empty();
    }
}
