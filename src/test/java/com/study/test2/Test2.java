package com.study.test2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test2 {
    /**
     * 문제 설명
     * 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다. my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
     *
     * 제한사항
     * 1 ≤ my_string의 길이 ≤ 1,000
     * my_string의 원소는 영소문자로 이루어져 있습니다.
     * 1 ≤ index_list의 길이 ≤ 1,000
     * 0 ≤ index_list의 원소 < my_string의 길이
     */

    // 내 풀이
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        for (int i=0; i<index_list.length; i++) {
            answer += String.valueOf(my_string.charAt(index_list[i]));
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public String solution2(String my_string, int[] index_list) {

        StringBuilder sb = new StringBuilder();

        for (int idx : index_list)
            sb.append(my_string.charAt(idx));

        return sb.toString();
    }

    // 다른 사람들의 풀이2
    public String solution3(String myString, int[] indexList) {
        return Arrays.stream(indexList).mapToObj(operand -> String.valueOf(myString.charAt(operand))).collect(Collectors.joining());
    }
}
