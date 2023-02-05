package com.example.cote.programmers.lv0;

public class PizzaSchool {
    public int solution(int n) {

        if (n % 7 == 0) {
            return (n / 7);
        }

        return (n / 7) + 1;
    }

    public int solution2(int n) {

        if (!(n % 7 == 0)) {
            return (n / 7) + 1;

        }
        return (n / 7);
    }
}
