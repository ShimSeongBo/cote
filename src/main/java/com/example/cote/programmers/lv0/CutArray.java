package com.example.cote.programmers.lv0;

public class CutArray {
    public int[] solution(int[] numbers, int num1, int num2) {

        int i = 0;
        int[] result = new int[(num2 - num1) + 1];

        while (num1 + i <= num2) {
            result[i] = numbers[num1 + i];
            i++;
        }

        return result;
    }
}
