package com.example.cote.programmers.lv0;

public class RemoveSpecificCharacters {

    public String solution(String my_string, String letter) {

        return my_string.replaceAll(letter, "");
    }
}
