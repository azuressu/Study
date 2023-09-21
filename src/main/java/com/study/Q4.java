package com.study;

public class Q4 {

    /**
     * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
     * 12 ⊕ 3 = 123
     * 3 ⊕ 12 = 312
     * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
     * 단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
     * 제한사항
         * 1 ≤ a, b < 10,000
     */
    public int solution(int a, int b) {
        int answer = 0;

        String sa = String.valueOf(a);
        String sb = String.valueOf(b);

        int ab = Integer.valueOf(sa+sb);
        int ba = Integer.valueOf(sb+sa);

        if (ab > ba) {
            answer = ab;
        } else {
            answer = ba;
        }

        return answer;
    }

    public int solution2(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);

        answer = aLong > bLong ? aLong : bLong;
        return answer;
    }

    public int solution3(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}
