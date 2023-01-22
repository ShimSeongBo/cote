package com.example.cote.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfArrayElementTest {

    LengthOfArrayElement lengthOfArrayElement = new LengthOfArrayElement();

    @Test
    void case1() {
        String[] strlist ={"We", "are", "the", "world!"};
        int[] solution = lengthOfArrayElement.solution(strlist);

//        assertEquals(solution , solution); 기댓값 - [2,3,3,6] 인데 어떻게 만들어서 넣지?
    }

}