package com.example.cote.programmers.lv0;

import java.util.Arrays;

public class IDontLikeEvenNumbers {
    public int[] solution(int n) {

        int[] answer = new int[n / 2 + 1];

        for (int i = 1, j = 0; i <= n; i += 2, j++) {
            answer[j] = i;
        }

        if (n % 2 == 1) {
             answer = Arrays.copyOf(answer, answer.length-1);
        }

        return answer;
    }
}
