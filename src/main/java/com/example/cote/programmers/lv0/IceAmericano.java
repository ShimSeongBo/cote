package com.example.cote.programmers.lv0;

public class IceAmericano {
    public int[] solution(int money) {

        int iceAmericanoPrice = 5500;

        int quotient = money / iceAmericanoPrice;
        int remainder = money % iceAmericanoPrice;

        return new int[]{quotient, remainder};
    }
}
