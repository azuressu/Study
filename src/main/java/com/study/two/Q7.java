package com.study.two;

public class Q7 {

    /**
     * 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
     * 제한사항
     * -50000 ≤ num1 ≤ 50000
     * -50000 ≤ num2 ≤ 50000
     */

    // 내 풀이
    public int solution(int num1, int num2) {
        boolean val = num1 >= -50000 && num2 >= -50000 && num1 <= 50000 && num2 <= 50000;
        int answer = 0;

        if (val) {
            answer = num1 - num2;
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int num1, int num2) {
        return num1-num2;
    }

    // 다른 사람들의 풀이2
    public int solution3(int num1, int num2) {
        int answer = 0;

        if((-50000 <= num1 && num1 <= 50000) && (-50000 <= num1 && num1 <= 50000)) {
            answer = num1 - num2;
        }

        return answer;
    }

}
