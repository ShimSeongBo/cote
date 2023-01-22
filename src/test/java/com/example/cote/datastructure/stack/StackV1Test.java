package com.example.cote.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackV1Test {


    private final StackV1 myStack = new StackV1();

    @Test
    void case1() {
        // given
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;
        int number6 = 6;

        myStack.push(number1);
        myStack.push(number2);
        myStack.push(number3);
        myStack.push(number4);
        myStack.push(number5);
        myStack.push(number6);

        int realSize = 6;

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

        myStack.push(number1);
        myStack.push(number2);
        myStack.push(number3);

        int topElement = 2;

        // when
        int removedElement = myStack.pop();

        // then
        assertEquals(topElement, removedElement);
    }

    @Test
    void case3() {
        // given
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;

        myStack.push(number1);
        myStack.push(number2);
        myStack.push(number3);

        int topElement = 3; // 스택 구조

        // when
        int peakElement = myStack.peek();

        // then
        assertEquals(topElement, peakElement);

    }

}