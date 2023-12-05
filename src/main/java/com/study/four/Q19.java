package com.study.four;

public class Q19 {

    /**
     * 문제 설명
     * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
     *
     * 제한사항
     * 1 ≤ n ≤ 100
     */

    // 내 풀이
    public int solution(int n) {
        int answer = 0;

        int g = gcd(n, 6);

        answer = n / g;

        return answer;
    }

    public int gcd (int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return gcd(num2, num1 % num2);
    }

    // 다른 사람들이 풀이1
    public int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }

    public int LCM(int num1, int num2) {
        return num1 * num2 / GCD(num1, num2);
    }

    public int solution2(int n) {
        return LCM(n, 6) / 6;
    }

    // 다른 사람들이 풀이2
    public int solution3(int n) {
        int answer = 1;

        while(true){
            if(6 * answer % n == 0) break;
            answer++;
        }

        return answer;
    }
}
