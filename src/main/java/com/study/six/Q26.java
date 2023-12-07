package com.study.six;

import java.util.*;

public class Q26 {
    /**
     * 문제 설명
     * 문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 1 ≤ my_string의 길이 ≤ 1,000
     */

    // 내 풀이
    public String solution(String my_string) {
        String answer = "";

        char[] charArray = my_string.toCharArray();

        for (int i=charArray.length-1; i>=0; i--) {
            answer += charArray[i];
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public String solution2(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }

    // 다른 사람들의 풀이2
    public String solution3(String myString) {
        return new StringBuilder(myString).reverse().toString();
    }

    // 다른 사람들의 풀이3
    public String solution4(String my_string) {
        String answer = "";

        for(int i=my_string.length()-1; i>=0; i--){
            answer+=my_string.charAt(i);
        }

        return answer;
    }
}
