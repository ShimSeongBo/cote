package com.example.cote.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackV2Test {

    private final StackV2 myStack = new StackV2();

    @Test
    void case1() {
        // given
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        myStack.push(number1);
        myStack.push(number2);
        myStack.push(number3);

        int realSize = 3;

        // when
        int size = myStack.size();

        // then
        assertEquals(realSize, size);
    }

    @Test
    void case2() {
        // given
        int number1 = 1;
        int number2 = 3;
        int number3 = 2;
        int number4 = 4;

        myStack.push(number1);
        myStack.push(number2);
        myStack.push(number3);
        myStack.push(number4);

        int topElement = 4;

        // when
        int removedElement = myStack.pop();

        // then
        assertEquals(topElement, removedElement);
    }

}