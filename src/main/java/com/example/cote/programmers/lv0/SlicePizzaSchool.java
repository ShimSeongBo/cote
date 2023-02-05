package com.example.cote.programmers.lv0;

public class SlicePizzaSchool {

    public int solution(int slice, int n) {

        int dividePizza = n / slice;

        if (!(n % slice == 0)) {

            return dividePizza + 1;
        }

        return dividePizza;
    }
}
