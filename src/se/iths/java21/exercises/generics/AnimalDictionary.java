package se.iths.java21.exercises.generics;

import se.iths.java21.exercises.chapter6.animals.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalDictionary {

    public static void main(String[] args) {
        Map<String, Animal> animalDictionary = new HashMap<>();

        Bird birdy = new Bird();
        Salmon sammy = new Salmon();
        Fish fishy = new Fish();
        Woodpecker woody = new Woodpecker();
        Elephant elfy = new Elephant();

        animalDictionary.put("birdy", birdy);
        animalDictionary.put("sammy", sammy);
        animalDictionary.put("fishy", fishy);
        animalDictionary.put("woody", woody);
        animalDictionary.put("elfy", elfy);
        animalDictionary.putIfAbsent("elfy", woody);


        System.out.println(animalDictionary.get("elfy"));
    }

    void test(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Martin"));
        people.add(new Person("Maria"));

        for (int i = 0; i < people.size(); i++) {
            if("Maria".equals(people.get(i).name))
                System.out.println("Found her");
        }

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("Martin", new Person("Martin"));
        personMap.put("Maria", new Person("Maria"));

        System.out.println(personMap.get("Maria"));


    }
}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }
}
