package com.study.eight;

import java.util.stream.Collectors;

public class Q35 {

    /**
     * 문제 설명
     * 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * age는 자연수입니다.
     * age ≤ 1,000
     * PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.
     */

    // 내 풀이
    public String solution(int age) {
        String answer = "";

        char[] ageArray = String.valueOf(age).toCharArray();

        for (char c: ageArray) {
            // parseInt() 안에 들어가야할 데이터의 타입은 string
            answer += (char)(Integer.parseInt(String.valueOf(c))+97);
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public String solution2(int age) {
        return String.valueOf(age).chars().mapToObj(operand -> String.valueOf((char) (49 + operand))).collect(Collectors.joining());
    }

    // 다른 사람들의 풀이2
    public String solution3(int age) {
        StringBuilder sb = new StringBuilder();

        while(age > 0) {
            sb.insert(0, (char) ((age % 10) + (int)'a'));
            age /= 10;
        }

        return sb.toString();
    }

    // 다른 사람들의 풀이3
    public String solution4(int age) {
        String answer = "";
        String[] alpha = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        while(age>0){
            answer = alpha[age % 10] + answer;
            age /= 10;
        }

        return answer;
    }
}
