package se.iths.java21.streams;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static se.iths.java21.streams.Sex.FEMALE;
import static se.iths.java21.streams.Sex.MALE;

public class StreamDemo {


    public static void main(String[] args) {

        List<PersonR> persons = getPersonRList();

        //persons.forEach(System.out::println);
       // System.out.println("=======");

        List<PersonR> otherPersons = getPersonsOverAge30(persons);
       // otherPersons.forEach(System.out::println);

        long count = getCountOfPersonsYoungerThan15(persons);
        //System.out.println(count);

        int ageSum = getSumOfAges(persons);

        //System.out.println(ageSum);

     //   persons.stream()
               // .peek(personR -> System.out.println("Peek before filter: " + personR))
      //          .mapToInt(PersonR::age)
            //    .peek(age-> System.out.println("After map"))
        //        .filter(age -> age > 30)
          //      .max().ifPresent(System.out::println);

        Stream.iterate(0,n-> ++n)
                .limit(100)
                .filter(i-> i % 2 == 0)
                .forEach(System.out::println);

        persons.stream().filter(personR -> personR.sex()== FEMALE)
                .sorted(Comparator.comparingInt(PersonR::age))
                .forEach(System.out::println);

    }


    private static Optional<PersonR> getPersonWithName(List<PersonR> persons, String name) {
        return persons.stream().filter(personR -> personR.name().equals(name))
                .findAny();
    }


    private static int getSumOfAges(List<PersonR> persons) {
        return persons.stream()
                .mapToInt(PersonR::age)
                .sum();
    }

    private static long getCountOfPersonsYoungerThan15(List<PersonR> persons) {
        return persons.stream().filter(person -> person.age() < 15).count();
    }

    @NotNull
    private static List<PersonR> getPersonsOverAge30(List<PersonR> persons) {
        return persons.stream()
                .filter(personR -> personR.age() > 30)
                .collect(Collectors.toList());
    }

    @NotNull
    private static List<PersonR> getPersonRList() {
        List<PersonR> persons = List.of(
                new PersonR("Martin", 44, MALE, true),
                new PersonR("Anna", 32, FEMALE, false),
                new PersonR("Elisabeth", 12, FEMALE, false),
                new PersonR("Sven", 24, Sex.OTHER, true));
        return persons;
    }
}
