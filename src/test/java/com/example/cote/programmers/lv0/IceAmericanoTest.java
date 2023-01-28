package com.example.cote.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceAmericanoTest {
    IceAmericano iceAmericano = new IceAmericano();

    @Test
    void case1() {

        int[] solution = iceAmericano.solution(5500);
//        int[] input = {1, 0};
//        assertEquals(input, solution);
    }

    @Test
    void case2() {
        iceAmericano.solution(5500);
    }
}