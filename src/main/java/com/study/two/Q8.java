package com.study.two;

public class Q8 {

    /**
     * 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 0 ≤ num1 ≤ 100
     * 0 ≤ num2 ≤ 100
     */

    // 내 풀이
    public int solution(int num1, int num2) {
        boolean val = (num1 >= 0 && num1 <= 100) && (num2 >= 0 && num2 <= 100);
        int answer = 0;

        if (val) {
            answer = num1 * num2;
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int num1, int num2) {
        int answer = 0;
        if(0<=num1 && 100>=num1 && 0<=num2 && 100>=num2){
            answer = num1 * num2;
        }
        return answer;
    }

    // 다른 사람들의 풀이2
    public int solution3(int num1, int num2) {
        return num1*num2;
    }
}