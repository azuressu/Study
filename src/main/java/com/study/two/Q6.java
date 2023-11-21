package com.study.two;

public class Q6 {

    /*
    * 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
    제한사항
    -50,000 ≤ num1 ≤ 50,000
    -50,000 ≤ num2 ≤ 50,000
    * */

    // 내 풀이
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int num1, int num2) {
        boolean val = (num1 >= -50000 && num1 <= 50000 && num2 <= 50000 && num2 >= -50000);
        int answer = -1;

        if (val) {
            answer = num1 + num2;
        }
        return answer;
    }

    // 다른 사람들의 풀이2
    public int solution3(int num1, int num2) {
        int answer = -1;
        int minimum = -50000;
        int maximum = 50000;

        if (num1 <= maximum || num1 >= minimum && num2 <= maximum || num2 >= minimum) {
            answer = num1 + num2;
        }

        return answer;

    }

}
