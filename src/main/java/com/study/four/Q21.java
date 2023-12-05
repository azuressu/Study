package com.study.four;

import java.util.Arrays;

public class Q21 {

    /**
     * 문제 설명
     * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 0 ≤ numbers의 원소 ≤ 1,000
     * 1 ≤ numbers의 길이 ≤ 100
     * 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
     */

    // 내 풀이
    public double solution(int[] numbers) {
        double answer = 0;
        answer = ((double)numbers[0] + (double)numbers[numbers.length-1]) / 2;
        return answer;
    }

    // 다른 사람들의 풀이1
    public double solution2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

    // 다른 사람들의 풀이2
    public double solution3(int[] numbers) {
        double answer = 0;

        int sum = 0;
        for(int i: numbers){
            sum+=i;
        }
        answer = sum/(double)numbers.length;
        return answer;
    }
}
