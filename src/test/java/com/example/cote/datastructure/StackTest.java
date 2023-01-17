package com.example.cote.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {

    private final Stack stack = new Stack();

    @Test
    void case1() {
        // given
        int number1 = 1;
        int number2 = 3;
        int number3 = 2;

        stack.push(number1);
        stack.push(number2);
        stack.push(number3);

        int realSize = 3;

        // when
        int size = stack.size();

        // then
        assertEquals(realSize, size);
    }

    @Test
    void case2() {
        // given
        int number1 = 1;
        int number2 = 3;
        int number3 = 2;

        stack.push(number1);
        stack.push(number2);
        stack.push(number3);

        int topElement = 2;

        // when
        int removedElement = stack.pop();

        // then
        assertEquals(topElement, removedElement);
    }

}