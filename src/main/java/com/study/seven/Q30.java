package com.study.seven;

public class Q30 {

    /**
     * 문제 설명
     * 문자열 my_string과 문자 letter이 매개변수로 주어집니다. my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 1 ≤ my_string의 길이 ≤ 100
     * letter은 길이가 1인 영문자입니다.
     * my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
     * 대문자와 소문자를 구분합니다.
     */

    // 내 코드
    public String solution(String my_string, String letter) {
        String answer = "";
        char[] charArray = my_string.toCharArray();

        for (char ch: charArray) {
            if (String.valueOf(ch).equals(letter)) continue;
            answer += ch;
        }

        return answer;
    }
    
    // 다른 사람들의 풀이1
    // replace라는 메소드를 사용하여 letter 자리를 "" (공백)으로 대체
    public String solution2(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }
}
