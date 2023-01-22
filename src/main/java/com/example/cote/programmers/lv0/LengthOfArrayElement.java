package com.example.cote.programmers.lv0;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LengthOfArrayElement {

    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        int length = strlist.length;
        for (int i = 0; i < length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] strlist = {"hi", "hello", "123"};
        log.info(String.valueOf(strlist.length));
        log.info(String.valueOf(strlist[0].length()));
        log.info(String.valueOf(strlist[1].length()));
        log.info(String.valueOf(strlist[2].length()));
    }
}
