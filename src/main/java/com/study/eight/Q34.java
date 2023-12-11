package com.study.eight;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Q34 {
    /**
     * 문제 설명
     * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
     *
     * 제한사항
     * 2 ≤ numbers의 길이 ≤ 30
     * 0 ≤ numbers의 원소 ≤ 1,000
     * 0 ≤num1 < num2 < numbers의 길이
     */

    // 내 풀이 (참고)
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];

        // System에서 제공하는 arraycopy 메소드를 사용.
        // 복사될 배열, 복사될 배열의 시작 인덱스 번호, 복사해올 배열, 복사해올 배열의 시작 인덱스 번호, 가져올 개수
        System.arraycopy(numbers, num1, answer, 0, (num2-num1+1));

        return answer;
    }

    // 다른 사람들의 풀이1
    public int[] solution2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }

    // 다른 사람들의 풀이2
    public int[] solution3(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i];
        }

        return answer;
    }

    // 다른 사람들의 풀이3
    public int[] solution4(int[] numbers, int num1, int num2) {
        return IntStream.rangeClosed(num1, num2).map(i -> numbers[i]).toArray();
    }
}
