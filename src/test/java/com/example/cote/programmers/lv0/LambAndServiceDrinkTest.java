package com.example.cote.programmers.lv0;

import com.example.cote.programmers.lv0.LambAndServiceDrink;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LambAndServiceDrinkTest {

    private final LambAndServiceDrink lambAndServiceDrink = new LambAndServiceDrink();

    @Test
    void caseOne() {

        int a = 10;
        int b = 3;

        int solution = lambAndServiceDrink.solution(a, b);

        assertEquals(124000, solution);

    }

    @Test
    void caseTwo() {

        int a = 64;
        int b = 6;

        int solution = lambAndServiceDrink.solution(a, b);

        assertEquals(768000, solution);
    }
}