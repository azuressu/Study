package com.study;

public class Q5 {
    /**
     * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
     * 12 ⊕ 3 = 123
     * 3 ⊕ 12 = 312
     * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
     * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
     * 제한사항
         * 1 ≤ a, b < 10,000
     */
    public int solution(int a, int b) {
        int answer = 0;

        int a1 = Integer.valueOf(a + "" + b);
        int a2 = 2 * a * b;

        answer = a1 >= a2 ? a1 : a2;

        return answer;
    }

    public int solution2(int a, int b) {
        return Math.max(Integer.parseInt(String.valueOf(a) + String.valueOf(b)), 2*a*b);
    }

    public int solution3(int a, int b) {
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        return Math.max(Integer.parseInt(s1+s2), 2*a*b);
    }
}
