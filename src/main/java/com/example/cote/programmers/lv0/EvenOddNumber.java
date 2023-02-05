package com.example.cote.programmers.lv0;

public class EvenOddNumber {
    public int[] solution(int[] num_list) {

        int evenValue = 0;
        int oddValue = 0;

        for (int i = 0; i < num_list.length; i++) {

            if (num_list[i] % 2 == 1) evenValue++;

            else oddValue++;
        }

        return new int[]{oddValue, evenValue};
    }

    public int[] solution2(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }
}
