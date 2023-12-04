package com.study.three;

import java.util.*;
import java.util.stream.Collectors;

public class Q15 {

    /**/


    // 참고한 풀이 (런타임 에러)
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int array2[] = new int [100]; // 배열의 길이 때문인듯

        for (int i=0; i<array.length; i++) {
            array2[array[i]] ++;

            if (max < array2[array[i]]) {
                max = array2[array[i]];
                answer = array[i];
            }
        }

        int num = 0;
        for (int j=0; j<100; j++) {
            if (max == array2[j]) num++;
            if (num > 1) answer = -1;
        }

        return answer;
    }

    // 참고한 풀이
    public int solution2(int[] array) {
        int answer = 0;
        int max = 0;
        int array2[] = new int [1000];

        for (int i=0; i<array.length; i++) {
            array2[array[i]]++;
        }

        for (int j=0; j<array2.length; j++) {
            if(array2[j] > max) {
                max = array2[j]; // 최대값
                answer = j;
            } else if (max == array2[j]) {
                answer = -1;
            }

        }

        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution3(int[] array) {
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
        // getPrDefault(Object key, V DefaultValue)
        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
        // key : 값을 가져와야 하는 요소의 키
        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환

        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }

    // 다른 사람들의 풀이2
    public int solution4(int[] array) {
        List<Map.Entry<Integer, List<Integer>>> list = new ArrayList<>(Arrays.stream(array).boxed().collect(Collectors.groupingBy(o -> o)).entrySet()).stream().sorted((t0, t1) -> Integer.compare(t1.getValue().size(), t0.getValue().size())).collect(Collectors.toList());
        return list.size() > 1 && list.get(0).getValue().size() - list.get(1).getValue().size() == 0 ? -1 : list.get(0).getKey();
    }


}
