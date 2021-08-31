package se.iths.java21.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicArrayTest {

    @Test
    void addOneItemShouldPutSaidItemInFirstIndex() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);

        assertEquals(1, dynamicArray.values[0]);
    }

    @Test
    void addTwoItemShouldPutSaidItemsInFirstAndSecondIndex() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);

       // assertEquals(1, dynamicArray.values[0]);
       // assertEquals(2, dynamicArray.values[1]);
        int[] expected = {1,2,0,0,0,0,0,0,0,0};
        assertArrayEquals(expected, dynamicArray.values);
    }
    @Test
    void removeLastReturnsLastAddedItem(){
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);

        int returnedValue = dynamicArray.removeLast();

        assertEquals(2, returnedValue);
        assertEquals(1, dynamicArray.count);
    }
    @Test
    void callingRemoveLastOnEmptyArrayReturns0() {
        DynamicArray dynamicArray = new DynamicArray();
        int returnedValue = dynamicArray.removeLast();
        assertEquals(0,returnedValue);
    }

    @Test
    void addingThreeItemsShouldReturnLengtThree() {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);

        int result = dynamicArray.length();
        assertEquals(3, result);


    }

}