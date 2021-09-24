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

    public boolean removeMoney(float money) {
        boolean success = false;
        if (money <= getMoney()) {
            this.money -= money;
            success = true;
        }
        return success;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                ", money=" + money +
                '}';
    }
}
