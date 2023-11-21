package com.study.one;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Q1 {

    /**
     * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
     * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
     * 제한사항
        * 1 ≤ str1의 길이 = str2의 길이 ≤ 10
        * str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
     */
    public String solution(String str1, String str2) {
        String answer = "";
        for (int i=0; i<str1.length(); i ++) {
            answer += String.valueOf(str1.charAt(i));
            answer += String.valueOf(str2.charAt(i));
        }
        return answer;
    }

    public String solution2(String str1, String str2) {
        String answer = "";

        for(int i = 0; i < str1.length(); i++){
            answer+= str1.charAt(i);
            answer+= str2.charAt(i);
        }

        return answer;
    }

    public String solution3(String str1, String str2) {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i<chars1.length; i++) {
            stringBuilder.append(chars1[i]).append(chars2[i]);
        }

        return stringBuilder.toString();
    }

    public String solution4(String str1, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<str1.length(); i++) {
            stringBuffer.append(str1.charAt(i)).append(str2.charAt(i));
        }
        return stringBuffer.toString();
    }

}
