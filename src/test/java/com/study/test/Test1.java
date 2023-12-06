package com.study.test;

import org.junit.jupiter.api.Test;

import java.util.*;

public class Test1 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i=0; i<queries.length; i++) {
            int num1 = arr[queries[i][0]];
            int num2 = arr[queries[i][1]];

            arr[queries[i][0]] = num2;
            arr[queries[i][1]] = num1;
        }

        answer = arr;
        return answer;
    }

    @Test
    void testing() {
        int [] test = new int[] {0,1,2,3,4};
        int [][] test2 = new int[][] {{0, 3}, {1, 2}, {1, 4}};
        int [] i = solution(test, test2);
        for (int in: i) {
            System.out.println(in);
        }
    }


    // 다른 사람들의 풀이1
    public int[] solution2(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);

        for (int[] query : queries) {
            int i = query[0];
            int j = query[1];

            int temp = answer[i];
            answer[i] = answer[j];
            answer[j] = temp;
        }

        return answer;
    }

}
