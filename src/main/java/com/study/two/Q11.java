package com.study.two;

public class Q11 {
    /**
     * 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
     * 제한사항
     * 0 ≤ num1 ≤ 10,000
     * 0 ≤ num2 ≤ 10,000
     */


    // 내 풀이
    public int solution(int num1, int num2) {
        boolean val = (num1 >= 0 && num1 <= 10000) && (num2 >=0 && num2 <= 10000);
        int answer = 0;

        if (val) {
            if (num1 == num2) {
                answer = 1;
            } else {
                answer = -1;
            }
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }

    // 다른 사람들의 풀이2
    public int solution3(int num1, int num2) {
        boolean val = (0<=num1 && num1<=10000 && 0<=num2 && num2 <=10000);
        int answer = 0;

        if(val){
            answer=(num1==num2)? 1: -1;
        }
        return answer;
    }
}
