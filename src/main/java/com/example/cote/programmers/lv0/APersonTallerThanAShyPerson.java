package com.example.cote.programmers.lv0;

public class APersonTallerThanAShyPerson {

    public int solution(int[] array, int height) {

        int result = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > height) result++;
        }

        return result;
    }

    public int solution2(int[] array, int height) {

        int result = 0;

        for (int i : array) {

            if (i > height) result++;
        }

        return result;
    }
}
