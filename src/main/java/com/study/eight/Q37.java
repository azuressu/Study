package com.study.eight;

import java.util.stream.IntStream;

public class Q37 {

    /**
     * 문제 설명
     * 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 자연수 n이 매개변수로 주어질 때 두 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 1 ≤ n ≤ 1,000,000
     */

    // 내 풀이
    public int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n; i++) {
            if (n % i == 0) answer++;
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int n) {
        // 1~n 까지의 숫자 범위 중에서, n을 증가하는 숫자 i로 나눴을 때의 나머지가 0이라면 count 해라
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }

    // 다른 사람들의 풀이2
    public int solution3(int n) {
        if(n < 2) return n;

        int answer = 2;

        for(int i=2; i<Math.sqrt(n+1); i++){
            if(n % i == 0){
                answer += i == n / i ? 1 : 2;
            }
        }
        return answer;
    }

}
