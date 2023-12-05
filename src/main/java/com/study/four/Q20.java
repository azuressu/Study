package com.study.four;

public class Q20 {

    /**
     * 문제 설명
     * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
     *
     * 제한사항
     * 2 ≤ slice ≤ 10
     * 1 ≤ n ≤ 100
     */

    // 내 풀이
    public int solution(int slice, int n) {
        int answer = 0;

        answer = n % slice > 0 ? (int)(n / slice) + 1 : n / slice;

        return answer;
    }


    // 다른 사람들의 풀이1
    public int solution2(int slice, int n) {
        return n % slice > 0 ? n/slice+1 : n/slice;
    }

    // 다른 사람들의 풀이2
    public int solution3(int slice, int n) {
        // n을 slice로 나누게 되면, 나머지는 0~n-1 까지 나오게 된다
        return (n + slice-1)/slice;
    }

}
