package com.study.test2;

public class Test1 {
    /**
     * 문제 설명
     * boolean 변수 x1, x2, x3, x4가 매개변수로 주어질 때, 다음의 식의 true/false를 return 하는 solution 함수를 작성해 주세요.
     *
     * (x1 ∨ x2) ∧ (x3 ∨ x4)
     * 입출력 예
     * x1	     x2  	x3	    x4	    result
     * false	true	true	true	true
     * true	    false	false	false	false
     *
     * ∨과 ∧의 진리표는 다음과 같습니다.
     *
     * x	y	x ∨ y	x ∧ y
     * T	T	  T	      T
     * T	F	  T	      F
     * F	T	  T	      F
     * F	F	  F	      F
     */

    // 내 풀이
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;

        boolean x12 = (x1 == true || x2 == true) ? true : false;
        boolean x34 = (x3 == true || x4 == true) ? true : false;
        answer = (x12 == false || x34 == false) ? false : true;

        return answer;
    }

    // 다른 사람들의 풀이1
    public boolean solution2(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1||x2) && (x3||x4);
        return answer;
    }

}
