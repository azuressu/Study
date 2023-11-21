package com.study.two;

public class Q9 {

    /*
    * 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
        제한사항
        0 < num1 ≤ 100
        0 < num2 ≤ 100
    * */


    // 내 풀이
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean val = (num1 > 0 && num1 <= 100) && (num2 > 0 && num2 <= 100);

        if (val) {
            answer = num1 / num2;
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int num1, int num2) {
        int answer = num1/num2;
        return answer;
    }

    // 다른 사람들의 풀이2
    public int solution3(int num1, int num2) {
        int answer = 0;
        answer = division(num1,num2);
        return answer;
    }

    public int division(int num1 , int num2){
        int answer = num1 / num2 ;

        return answer;
    }
}
