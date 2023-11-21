package com.study.two;

public class Q13 {

    /**
     * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
     * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
     * 두 분수를 더한 값을 기약 분수로 나타냈을 때
     * 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
     * 제한사항
     * 0 <numer1, denom1, numer2, denom2 < 1,000
     */

    // 내 풀이
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];
        boolean val = (numer1 > 0 && numer1 < 1000) &&
                (denom1 > 0 && denom1 < 1000) &&
                (numer2 > 0 && numer2 < 1000) &&
                (denom2 > 0 && denom2 < 1000);

        if (val) {
            int num1 = numer1 * denom2 + numer2 * denom1;
            int num2 = denom1 * denom2;

            int gcd1 = gcd(num1, num2);
            answer[0] = num1 / gcd1;
            answer[1] = num2 / gcd1;
        }

        return answer;
    }

    public int gcd (int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }

        return gcd (num2, num1 % num2);
    }

    // 다른 사람들의 풀이1
    public int[] solution2(int denum1, int num1, int denum2, int num2) {
        int mother = num1 * num2;
        int son1 = num1 * denum2;
        int son2 = num2 * denum1;
        int totalSon = son1 + son2;
        for(int i = mother; i >= 1; i--){
            if(totalSon % i == 0 && mother % i == 0){
                totalSon /= i;
                mother /= i;
            }
        }
        int[] answer = {totalSon, mother};
        return answer;
    }
}
