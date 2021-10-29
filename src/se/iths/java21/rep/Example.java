package se.iths.java21.rep;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example {

    private String field1;
    private int value;
    private boolean record;

    //Default constructor
    //No params constructor
    public Example(){
        //Constructor initializes fields
        field1 = "";
    }

    //Overloaded constructor version
    public Example(String text) {
        this.field1 = text;
    }


    public static void main(String[] args) {
        Example example = new Example();
        Example example1 = example;

        example1.field1 = "Changed";

        System.out.println("Example: "+example.field1);
        System.out.println("Example1: "+example1.field1);

        int a = 1;
        int b = a;
        a = 2;
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        //Literals
        String s = "This becomes a string";
        char c = 'b';
        Example example2 = null;
        float f = 0.1f;
        long l = 121232323223L;

        //Compile time error
        //short s2 = 2232234;
        //System.out.println(s2);

        //Runtime error
        int i = 1 / 0;

        //Runtime error, null pointer exception
        String s1 = null;
        s1.isEmpty();

        //Runtime error
        int[] array = new int[2];
        array[2] = 4;


        //Unchecked exception
        try {
            int i2 = 1 / 0;
        }catch (RuntimeException e){

        }

        //Checked exception
        try {
            Files.write(Path.of(""),"".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getANumber(){
        return 0;
    }
}

interface Test {
    void test();
}

record Person(String name){}

enum Grade {
    IG,
    G,
    VG
}