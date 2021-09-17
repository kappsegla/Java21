package se.iths.java21.exercises.persons;

public abstract class Person {
    private final String name;
    private int age;
    private String work;
    private float money;

    public Person(String name, int age, String work, float money) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public float getMoney() {
        return money;
    }

    public void addMoney(float money) {
        this.money += money;
    }

    public void removeMoney(float money) {
        this.money -= money;
    }


}
