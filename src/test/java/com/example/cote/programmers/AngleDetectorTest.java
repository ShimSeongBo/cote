package com.example.cote.programmers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AngleDetectorTest {

    private final AngleDetector angleDetector = new AngleDetector();

    @Test
    void case1() {
        // given
        int angle = 80;
        int realAnswer = 1;

        // when
        int answer = angleDetector.detect(angle);

        // then
        assertEquals(realAnswer, answer);
    }

}