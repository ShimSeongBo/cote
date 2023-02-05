package com.example.cote.programmers.lv0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTextRepeatedlyTest {

    @Test
    void case1() {
        PrintTextRepeatedly printTextRepeatedly = new PrintTextRepeatedly();

        String hello = printTextRepeatedly.solution("Hello", 3);

        System.out.println(hello);
    }

}