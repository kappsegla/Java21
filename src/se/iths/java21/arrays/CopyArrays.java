package se.iths.java21.arrays;

import java.util.Arrays;

public class CopyArrays {
    public static void main(String[] args) {
        //This will not create a copy.
//        int[] a = {1, 2, 3, 4};
//        int[] b = a;
//
//        b[0] = 10;
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println("a:" + a[i]);
//            System.out.println("b:" + b[i]);
//        }
        int[] a = {1, 2, 3, 4};
        int[] b = Arrays.copyOf(a,a.length);

        b[0] = 10;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a:" + a[i]);
            System.out.println("b:" + b[i]);
        }
    }
}
