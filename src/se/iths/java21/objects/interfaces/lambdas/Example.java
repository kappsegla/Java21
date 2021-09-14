package se.iths.java21.objects.interfaces.lambdas;

public class Example {
    public static void main(String[] args) {

        OneParam oneParam =  (value)-> System.out.println(value);
        OneParam oneParam2 = System.out::println;

        oneParam.something("Test");
        oneParam2.something("Test2");

        ReturnType returnType = ( x, y ) -> x == y;
        System.out.println(returnType.compare(10, 10));
        System.out.println(returnType.compare(1, 2));

    }
}
