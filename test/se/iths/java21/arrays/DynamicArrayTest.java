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

        assertEquals(1, dynamicArray.values[0]);
        assertEquals(2, dynamicArray.values[1]);
    }

}