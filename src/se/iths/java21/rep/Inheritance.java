package se.iths.java21.rep;

public class Inheritance {

    public static void main(String[] args) {
        A anA = new D();
        Worker worker = new D();
        D anD = new D();

        A anotherA = anA;
        A oneMore = anD;
        //A secondOne = worker;
        C c = new C();
        B b = new E();
//        B b = new B();
//        A a = new A();


    }
}



interface A {
}

interface A2 extends A {
}

abstract class B {
    public abstract String hello();

    public void test() {
        System.out.println("Hej");
    }
}

class C {
}

class D implements A, Worker {

    @Override
    public void doWork() {

    }

    @Override
    public void takeLunchBreak() {

    }
}

final class E extends B {

    @Override
    public String hello() {
        return null;
    }
}

//class F extends E {
//
//}


interface Worker {
    void doWork();

    void takeLunchBreak();
}

class Human implements Worker {

    @Override
    public void doWork() {
        System.out.println("Working hard...");
    }

    @Override
    public void takeLunchBreak() {
        System.out.println("Eating food...");
    }
}

class Robot implements Worker {

    @Override
    public void doWork() {
        System.out.println("Working 24/7");
    }

    @Override
    public void takeLunchBreak() {
        throw new IllegalStateException();
    }
}



