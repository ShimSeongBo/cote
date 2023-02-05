package com.example.cote.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateMaxNumberV1Test {

    @Test
    void case1() {

        CreateMaxNumberV1 createMaxNumberV1 = new CreateMaxNumberV1();

        int solution = createMaxNumberV1.solution(new int[]{0, 31, 24, 10, 1, 9});

        System.out.println(solution);
    }
}