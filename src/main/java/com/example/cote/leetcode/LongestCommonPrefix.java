package com.example.cote.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Leetcode 14 - Java
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return ""; // 빈 배열이면 empty 반환

        int length = strs[0].length(); // 첫째 배열값으로 초기 세팅

        for (int i = 1; i < strs.length; i++) {
            length = Math.min(length, strs[i].length()); //

            for (int j = 0; j < length; j++) {
                char c = strs[0].charAt(j), d = strs[i].charAt(j);

                if (c != d) {
                    length = j;
                    break;
                }
            }
        }

        return strs[0].substring(0, length);
    }
}


/**
 * Geeks 풀이법
 * 1) 배열의 길이 확인
 *  1-1) size = 0 이면, empty 반환
 *  1-2) size = 1 이면, 배열 그대로 반환
 *
 * 2) 배열 정렬
 * 3) find the minimum length from first and last string
 *
 */
class GFG {
    public String longestCommonPrefix(String[] a) {
        int size = a.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return a[0];

        System.out.println(Arrays.toString(a));
        /* sort the array of strings */
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        /* find the minimum length from first and last string */
        int end = Math.min(a[0].length(), a[size - 1].length());

        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && a[0].charAt(i) == a[size - 1].charAt(i))
            i++;

        String pre = a[0].substring(0, i);
        return pre;
    }

    /* Driver Function to test other function */
    public static void main(String[] args) {
        GFG gfg = new GFG();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println("The longest Common Prefix is : " +
                gfg.longestCommonPrefix(input));

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(input));
    }
}