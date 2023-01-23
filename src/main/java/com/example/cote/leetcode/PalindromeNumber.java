package com.example.cote.leetcode;

public class PalindromeNumber {
    /**
     * 대칭인 수를 판별하는 메서드를 구현해야하네?
     * 예) 121, 10001
     * 1) 처음 생각한 방법은 단순하게 홀수자리 숫자라면 첫째자리 숫자와 끝자리 숫자를 대조해본다.
     * 2) 숫자를 거꾸로 배열하여 입력값과 대조해봄. (스택 - 선입후출)
     */
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverse = 0;
        int copy = x;

        while (copy > 0) {
            int digit = copy % 10;
            reverse = reverse * 10 + digit;
            copy /= 10;
        }

        return reverse == x;
    }
}
