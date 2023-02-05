package com.example.cote.programmers.lv0;

/**
 * 1) 스택에 넣었다가 차례대로 빼면 역순으로 출력 가능함.
 * 2) list의 끝번호부터 순차적으로 0번째까지 출력하기
 * 2-1) list의 길이 측정.
 * 2-2) (길이-1) ~ 0번째까지 출력하기.
 */
public class FlipArray {

    public int[] solution(int[] num_list) {

        int lengthOfNumList = num_list.length;

        int[] newList = new int[lengthOfNumList];

        int i = 0;

        while (i < lengthOfNumList) {
            newList[i] = num_list[(lengthOfNumList - 1) - i];
            i++;
        }

        return newList;
    }
}
