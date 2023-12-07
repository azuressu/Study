package com.study.six;

import java.util.stream.*;
import java.util.*;

public class Q28 {
    /**
     * 문제 설명
     * 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     *
     * 제한사항
     * 1 ≤ num_list의 길이 ≤ 100
     * 0 ≤ num_list의 원소 ≤ 1,000
     */

    // 내 풀이
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        answer[0] = 0;
        answer[1] = 0;

        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0] += 1;
            } else {
                answer[1] += 1;
            }
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int[] solution2(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }


    // 다른 사람들의 풀이2
    public int[] solution3(int[] numList) {
        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }

    // 다른 사람들의 풀이3
    public int[] solution4(int[] num_list) {
        return Arrays.stream(num_list)
                .boxed()
                .collect(Collectors.partitioningBy(number -> number % 2 == 1, Collectors.counting()))
                .values().stream()
                .mapToInt(Long::intValue)
                .toArray();
    }
}
