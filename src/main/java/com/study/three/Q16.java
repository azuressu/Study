package com.study.three;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Q16 {

    /*
    * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.

        제한사항
        1 ≤ n ≤ 100*/

    // 내 풀이
    public int[] solution(int n) {
        int[] answer;

        if (n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer =  new int [n / 2 + 1];
        }

        for (int i=0; i<answer.length; i++) {
            if (i == 0) answer[i] = 1;
            else answer[i] = answer[i-1] + 2;
        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int[] solution2(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }



    // 다른 사람들의 풀이2
    public int[] solution3(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i % 2 == 1){
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x -> x).toArray();
    }

}
