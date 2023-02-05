package com.example.cote.programmers.lv0;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 방법1)
 * 하나의 메서드는 하나의 일만 해야지
 *
 * 1) 최댓값 구하는 메서드
 * 2) 두번째 최댓값 구하는 메서드 ok?
 *
 * - 최댓값 하나 삭제해버리고 재귀로 돌리면 될 듯 한데?
 * - 제한사항에서 최소 두개의 원소를 갖고, 0이상의 원소임.
 *   - 0을 포함한 2개의 원소의 최댓값은 0일 수 밖에 없으므로,
 *   - 0을 if로 따로 건드릴 필요 없을듯?
 *
 * 방법2)
 * 배열 정렬해서 마지막 두 수를 꺼내서 곱하는 방법. 복잡도는?
 */

public class CreateMaxNumberV1 {
    public int solution(int[] numbers) {

        int[] max = new int[]{numbers[0]};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max[0]) {
                max[0] = numbers[i];
            }
        }

        Arrays.sort(numbers);

        int[] ints = Arrays.stream(numbers).sorted().toArray();

        return ints[numbers.length-1] * ints[numbers.length-2];

//
//        for (int i : numbers)
//            System.out.println(i);
//
//        return max[0];
    }
}
