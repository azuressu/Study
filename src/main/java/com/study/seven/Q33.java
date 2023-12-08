package com.study.seven;

import java.util.stream.IntStream;

public class Q33 {

    /**
     * 문제 설명
     * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
     *
     * 제한사항
     * 0 < n ≤ 1000
     */
    
    
    // 내 풀이
    public int solution(int n) {
        int answer = 0;

        for (int i=2; i<=n; i++) {
            if (i%2 == 0) answer += i;
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }

    // 다른 사람들의 풀이2
    public int solution3(int n) {
        /*
        * IntStream: 기본(primitive) 정수 요소의 열을 만들거나 병렬 집계 처리를 지원
        * range() : 종료 값을 포함하지 않는 메소드 ex. range(0,10) -> 0~9
        * rangeClosed() : 종료 값을 포함하는 메소드 ex. range(0,10) -> 0~10
        * sum() : 합계를 계산하는 메소드
        * max(), min(), average() : 최대/최소/평균값을 구하는 메소드
        * filter() : 조건을 줄 수 있는 메소드
        */
        return IntStream.rangeClosed(0, n)
                .filter(e -> e % 2 == 0)
                .sum();
    }
}
