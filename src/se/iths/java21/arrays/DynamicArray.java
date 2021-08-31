package se.iths.java21.arrays;

public class DynamicArray {

    int[] values = new int[10];
    int index = 0;

    void add(int value){
        values[index] = value;
        index = index + 1;
    }

    int removeLast(){
        int last = values[index-1];
        index--;
        return last;
    }

    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        for (int value: dynamicArray.values)
            System.out.println(value);
    }

}
