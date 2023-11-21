package com.study.two;

public class Q10 {

    /*
     * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
        제한사항
        0 < num1 ≤ 100
        0 < num2 ≤ 100
     */


    // 내 풀이
    public int solution(int num1, int num2) {
        boolean val = (num1 > 0 && num1 <= 100) && (num2 > 0 && num2 <= 100);
        int answer = 0;

        if (val) {
            float a = ((float)num1 / (float)num2) * 1000 ;
            answer = (int) a;
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int num1, int num2) {
        return num1 * 1000 / num2;
    }

    // 다른 사람들의 풀이2
    public int solution3(int num1, int num2) {
        double result = (double) num1 / (double) num2;
        return (int) (result * 1000);
    }

}
