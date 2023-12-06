package com.study.test;

import java.util.*;

public class Test3 {
    /**
     * 문제 설명
     * 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
     *
     * 변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
     *
     * 만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
     * stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
     * stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
     * 위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
     *
     * 제한사항
     * 1 ≤ arr의 길이 ≤ 100,000
     * 1 ≤ arr의 원소 ≤ 100,000
     */

    // 1. ArrayList
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int i = 0;

        while (i < arr.length) {
            if (arrayList.size() == 0) {
                arrayList.add(arr[i]);
                i++;
            } else if (arrayList.get(arrayList.size()-1) < arr[i]) {
                arrayList.add(arr[i]);
                i++;
            } else {
                arrayList.remove(arrayList.size()-1);
            }
        }

        int[] stk = new int[arrayList.size()];
        for (int j=0; j<stk.length; j++) {
            stk[j] = arrayList.get(j);
        }
        return stk;
    }


    // 2. Stack
    // pop()은 최근 추가된 원소 삭제, peek()는 최근 추가된 원소 조회
    public int[] solution2(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        int i = 0;

        while (i < arr.length) {
            if (stack.size() == 0) {
                stack.add(arr[i]);
                i++;
                // * stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
                //     * stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
            } else if (stack.peek() < arr[i]) {
                stack.add(arr[i]);
                i++;
            } else {
                stack.pop();
            }
        }

        int[] stk = new int [stack.size()];
        for (int j=0; j<stack.size(); j++) {
            stk[j] = stack.get(j);
        }
        // 혹은
        /*for (int j=stack.size(); j>=0; j--) {
            stk[j] = stack.pop();
        }*/
        return stk;
    }





}
