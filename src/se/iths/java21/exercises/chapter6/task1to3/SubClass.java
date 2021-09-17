package se.iths.java21.exercises.chapter6.task1to3;

public class SubClass extends GeneralClass {
    private String name;

    SubClass(){
        this.name = "";
    }

    SubClass(String name){
        this.name = name;
    }

    public String name(){
        return name;
    }

    public void name(String name){
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print(){
        System.out.println(name);
        super.print();
    }

    @Override
    public String toString() {
        return "SubClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
