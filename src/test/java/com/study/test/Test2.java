package com.study.test;

import org.junit.jupiter.api.Test;

public class Test2 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i=0; i<queries.length; i++) {
            for (int j=queries[i][0]; j<=queries[i][1]; j++) {
                if (j % queries[i][2] == 0) {
                    arr[j] += 1;
                }
                System.out.print(arr[j]);
            }
            System.out.println();
        }

        answer = arr;
        return answer;
    }

    @Test
    void test() {
        int [] test = new int[] {0, 1, 2, 4, 3};
        int [][] test2 = new int[][] {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        int [] i = solution(test, test2);
    }

    public int[] solution2(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) arr[j] += 1;
            }
        }
        return arr;
    }


}
