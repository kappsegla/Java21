package se.iths.java21.string;

import java.util.Objects;
import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = "10";
        String y = "10";

        String z = x + y;
        //x + y might generate call to concat by compiler
        z = x.concat(y);
        //Or this
        StringBuilder builder = new StringBuilder();
        builder.append(x);
        builder.append(y);
        z = builder.toString();

        for (int i = 0; i < 100; i++) {
            x = x + i;
        }

        StringBuilder builder2 = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder2.append(i);
        }
        z = builder2.toString();





        if( x == y )
            System.out.println("Same String Objects");

        String a = scanner.next();
        //To compare content in two text strings, always use equals method!!!
        if(Objects.equals(a, "10"))
        {
            System.out.println("You wrote 10");
        }

        a = a.intern();

        if( a == x){
            System.out.println("A equals X");
        }
    }
}
