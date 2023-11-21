package com.study.two;

import java.util.Arrays;

public class Q12 {

    /**
     * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
     * 제한사항
     * -10,000 ≤ numbers의 원소 ≤ 10,000
     * 1 ≤ numbers의 길이 ≤ 1,000
     */

    // 내 풀이
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i=0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int[] solution2(int[] numbers) {
        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }

    // 다른 사람들의 풀이2
    public int[] solution3(int[] numbers) {
        int[] answer = {};
        answer = new int[numbers.length];
        for(int i=0; i<answer.length; i++){
            answer[i] = numbers[i]*2;
        }
        return answer;
    }
}
