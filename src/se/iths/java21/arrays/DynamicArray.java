package se.iths.java21.arrays;

public class DynamicArray {

    int[] values = new int[10];
    private int count = 0;

    void add(int value){
        values[count] = value;
        count = count + 1;
    }

    int removeLast(){
        if( count == 0)
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
        for (int value: dynamicArray.values)
            System.out.println(value);
    }
}
