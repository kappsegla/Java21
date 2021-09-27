package se.iths.java21.streams;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private Sex sex;
    private boolean employed;

    public Person(String name, int age, Sex sex, boolean employed) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.employed = employed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && employed == person.employed && Objects.equals(name, person.name) && sex == person.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, employed);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", employed=" + employed +
                '}';
    }
}

record PersonR(String name, int age, Sex sex, boolean employed){}

enum Sex {
    MALE,FEMALE,OTHER
}
