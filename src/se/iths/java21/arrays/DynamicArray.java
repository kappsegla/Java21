package se.iths.java21.arrays;

public class DynamicArray {

    int[] values = new int[10];
    int index = 0;

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        for (int value: dynamicArray.values)
            System.out.println(value);

        if( dynamicArray.values[0] == 1)
            System.out.println("Success");
        else
            System.out.println("Fail");
        if( dynamicArray.values[1] == 2)
            System.out.println("Success");
        else
            System.out.println("Fail");
    }

    void add(int value){
        values[index] = value;
        index = index + 1;
    }





}
