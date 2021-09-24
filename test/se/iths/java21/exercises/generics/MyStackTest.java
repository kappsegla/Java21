package se.iths.java21.exercises.generics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    MyStack<String> myStack = new MyStack<>();

    @Test
    void pushOneItemPopShouldReturnThatItem() {
        myStack.push("First Item");
        String result = myStack.pop();

        assertEquals("First Item", result);
    }

    @Test
    void pushTwoItemsPopShouldReturnLastAddedItem() {
        myStack.push("First Item");
        myStack.push("Second Item");
        String result = myStack.pop();

        assertEquals("Second Item", result);
    }

    @Test
    void pushTwoItemsPopTwiceShouldReturnBothItemsInLIFOOrder() {
        myStack.push("First Item");
        myStack.push("Second Item");

        assertEquals("Second Item", myStack.pop());
        assertEquals("First Item", myStack.pop());
    }

    @Test
    void popBeforePushThrowsIllegalStateException() {
        assertThrows(IllegalStateException.class, () -> myStack.pop() );
    }

    @Test
    void popAfterTwoPushThreePop() {
        myStack.push("First Item");
        myStack.push("Second Item");

        myStack.pop();
        myStack.pop();
        assertThrows(IllegalStateException.class, () -> myStack.pop() );
    }

    @Test
    void peekReturnsLastPushedItemAndPopReturnsLastItem() {
        myStack.push("First Item");
        myStack.push("Second Item");

        assertEquals("Second Item", myStack.peek());
        assertEquals("Second Item", myStack.pop());
    }

    @Test
    void sizeReturnsNumberOfItemsPushedToStack() {
        myStack.push("One");
        myStack.push("Two");
        myStack.push("Three");
        assertEquals(3, myStack.size());
        myStack.pop();
        assertEquals(2, myStack.size());
    }

}