package se.iths.java21.arrays;

import java.util.ArrayList;

public class DynamicArray {

    int[] values = new int[10];
    private int count = 0;

    void add(int value) {
        if (count == values.length)
            grow();
        values[count] = value;
        count = count + 1;
    }

    private void grow() {
        //Create a new array with double size
        int[] newArray = new int[values.length * 2];
        //Copy data from old array to new array
        System.arraycopy(values, 0, newArray, 0, values.length);
        //Set values reference to point to new array in memory
        values = newArray;
    }

    int removeLast() {
        if (count == 0)
            return 0;
        return values[--count];
    }

    int length() {
        return count;
    }

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        for (int value : dynamicArray.values)
            System.out.println(value);
    }
}
