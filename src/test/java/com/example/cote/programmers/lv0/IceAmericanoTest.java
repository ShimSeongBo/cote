package com.example.cote.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IceAmericanoTest {
    IceAmericano iceAmericano = new IceAmericano();

    @Test
    void case1() {
        int[] solution = iceAmericano.solution(5500);

//        assertEquals(new int[] {1,0}, solution);
    }

    @Test
    void case2() {
        iceAmericano.solution(5500);
    }
}