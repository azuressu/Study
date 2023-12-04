package com.study.three;

public class Q14 {

    /* 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
        제한사항
        0 < num1 ≤ 100
        0 < num2 ≤ 100 */

    // 내 풀이
    public int solution(int num1, int num2) {
        int answer = -1;

        if (num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
            answer = num1 % num2;
        }
        return answer;
    }

    // 다른 사람들의 풀이
    public int solution2(int num1, int num2) {
        // num1이 num2보다 큰 동안은, 큰 숫자에서 작은 숫자를 빼내서 계속 진행하고,
        // 만약 조건에 벗어나는 경우 (num1이 num2보다 작아지는 경우)
        // 남아있는 그 숫자가 나머지가 됨
        while (num1 >= num2) {
            num1 = num1 - num2;
        }
        int answer = num1;
        return answer;
    }

    // 다른 사람들의 풀이2
    public int solution3(int num1, int num2) {
        int answer = -1;

        if(num2 != 0) answer = num1%num2;

        return answer;
    }

}
