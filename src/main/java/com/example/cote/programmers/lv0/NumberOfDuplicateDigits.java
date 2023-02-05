package com.example.cote.programmers.lv0;

public class NumberOfDuplicateDigits {

    public int solution(int[] array, int n) {

        int result = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == n) result++;
        }

        return result;
    }

    public int solution2(int[] array, int n) {

        int answer = 0;

        for (int num : array) {

            if (num == n) answer++;
        }

        return answer;
    }
}
