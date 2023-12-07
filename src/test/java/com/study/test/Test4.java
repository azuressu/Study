package com.study.test;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Test4 {

    /**
     * l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
     * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
     * @param l : 범위의 최소 숫자
     * @param r : 범위의 최대 숫자
     * @return: 0과 5로만 이루어진 모든 정수의 배열
     */

    // 내 풀이
    public int[] solution(int l, int r) {
        ArrayList<Integer> array = new ArrayList<>();

        for (int i=l; i<=r; i++) {
            // 해당 숫자(i)에 5 혹은 0 만 존재하는지 판별
            String num = String.valueOf(i);
            int count = 0;
            for (int j=0; j<num.length(); j++) {
                if (num.charAt(j) == '0' || num.charAt(j) == '5') count+=1;
            }

            if (count == num.length()) array.add(i);

        }

        int[] answer = {};

        if (array.size() == 0) {
            answer = new int [1];
            answer[0] = -1;
        } else {
            answer = new int [array.size()];
            for (int z=0; z<array.size(); z++) {
                answer[z] = array.get(z);
            }
        }

        return answer;
    }

    @Test
    void test() {
        int[] array = solution(5, 555);
        for (int ii: array) {
            System.out.println(ii);
        }
    }

    // 다른 사람들의 풀이1
    public int[] solution2(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }

    // 다른 사람들의 풀이2
    public int[] solution3(int l, int r) {
        int[] answer = IntStream.iterate(l, i -> i + 1).limit(r - l + 1).filter(i -> (i+"").replaceAll("[05]","").isEmpty()).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        return answer;
    }
}
