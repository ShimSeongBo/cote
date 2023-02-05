package com.example.cote.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EvenOddNumberTest {

    @Test
    void case1() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        int[] result = evenOddNumber.solution2(new int[]{1, 2, 3, 4, 5});

        System.out.println(result);
    }
}