package com.example.cote.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheLocationOfThePointTest {
    private final FindTheLocationOfThePoint findTheLocationOfThePoint = new FindTheLocationOfThePoint();

    @Test
    void case1() {
        int[] a = {500, 500};
        int solution = findTheLocationOfThePoint.solution(a);
        assertEquals(1, solution);
    }

    @Test
    void case2() {
        int[] a = {-500, 500};
        int solution = findTheLocationOfThePoint.solution(a);
        assertEquals(2, solution);
    }

    @Test
    void case3() {
        int[] a = {-500, -500};
        int solution = findTheLocationOfThePoint.solution(a);
        assertEquals(3, solution);
    }

    @Test
    void case4() {
        int[] a = {500, -500};
        int solution = findTheLocationOfThePoint.solution(a);
        assertEquals(4, solution);
    }
}