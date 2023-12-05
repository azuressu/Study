package com.study.four;

public class Q18 {
    /**
     * 문제 설명
     * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때, 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
     *
     * 제한사항
     * 1 ≤ n ≤ 100
     */

    // 내 풀이
    public int solution(int n) {
        int answer = 0;
        answer = ((n % 7 > 0) || (n < 7)) ? (int)(n/7) + 1 : (int)(n/7);
        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int n) {
        // 6은 어떤 수를 7로 나누면 나머지가 0~6까지만 존재하기 때문에 존재하는 숫자
        return (n + 6) / 7;
    }

    // 다른 사람들의 풀이2
    public int solution3(int n) {
        int answer = (n%7==0) ? n/7 : n/7 + 1;
        return answer;
    }
}
