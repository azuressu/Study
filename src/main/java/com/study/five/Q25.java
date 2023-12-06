package com.study.five;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Q25 {

    /**
     * 문제 설명
     * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 1 ≤ num_list의 길이 ≤ 1,000
     * 0 ≤ num_list의 원소 ≤ 1,000
     */

    // 내 풀이
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i=num_list.length-1; i>=0; i--) {
            answer[num_list.length - i - 1] = num_list[i];
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int[] solution2(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
        // primitive type이 더 빠르다
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // 다른 사람들의 풀이2
    public int[] solution3(int[] num_list) {
        int[] answer = new int[num_list.length];
        for(int i = 0; i< num_list.length; i++){
            answer[i] = num_list[num_list.length-i-1];
        }
        return answer;
    }

    // 다른 사람들의 풀이3
    public int[] solution4(int[] num_list) {
        return LongStream.range(1, num_list.length + 1)
                .mapToInt(i -> num_list[(int) (num_list.length - i)])
                .toArray();
    }
}
