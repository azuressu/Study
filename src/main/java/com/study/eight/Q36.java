package com.study.eight;

import org.springframework.aot.hint.TypeReference;

import java.util.*;
import java.util.stream.Collectors;

public class Q36 {

    /**
     * 문제 설명
     * 외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 중복된 원소는 없습니다.
     * 1 ≤ emergency의 길이 ≤ 10
     * 1 ≤ emergency의 원소 ≤ 100
     *
     * 입출력 예
     * emergency	            result
     * [3, 76, 24]	            [3, 1, 2]
     * [1, 2, 3, 4, 5, 6, 7]	[7, 6, 5, 4, 3, 2, 1]
     * [30, 10, 23, 6, 100]	    [2, 4, 3, 5, 1]
     */

    // 내 풀이
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i=0; i<answer.length; i++) {
            for (int j=0; j<answer.length; j++) {
                if (emergency[i] > emergency[j]) answer[j]++;
            }
        }

        for (int i=0; i<answer.length; i++) {
            answer[i] ++;
        }

        return answer;
    }


    // 다른 사람들의 풀이1
    public int[] solution2(int[] e) {
        return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }

    // 다른 사람들의 풀이2
    public int[] solution3(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){
            if(answer[i] != 0){
                continue;
            }
            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){
                    idx++;
                }
            }
            answer[i] = idx;
        }
        return answer;
    }

    // 다른 사람들의 풀이3
    public int[] solution4(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();

        // 0 부터 emergency 배열의 길이만큼 반복해서 새로운 emergencySort 배열을 생성
        int[] emergencySort = Arrays.copyOfRange(emergency, 0, emergency.length);
        // 해당 배열을 정렬
        Arrays.sort(emergencySort);

        // size 변수에 emergency 길이 숫자를 할당
        int size = emergency.length;
        // 배열 길이만큼 반복
        for(int i = 0; i<emergencySort.length; i++){
            // e 변수에 해당 emergencySort 배열의 값을 할당
            int e = emergencySort[i];
            map.put(e, size-i);
        }
        for(int i = 0; i<emergency.length; i++){
            emergency[i] = map.get(emergency[i]);
        }
        return emergency;
    }

}
