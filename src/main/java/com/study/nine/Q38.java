package com.study.nine;

import java.util.Arrays;

public class Q38 {

    /* 네 주사위에서 나온 숫자가 모두 p로 같다면 1111 × p점을 얻습니다.
       세 주사위에서 나온 숫자가 p로 같고 나머지 다른 주사위에서 나온 숫자가 q(p ≠ q)라면 (10 × p + q)2 점을 얻습니다.
       주사위가 두 개씩 같은 값이 나오고, 나온 숫자를 각각 p, q(p ≠ q)라고 한다면 (p + q) × |p - q|점을 얻습니다.
       어느 두 주사위에서 나온 숫자가 p로 같고 나머지 두 주사위에서 나온 숫자가 각각 p와 다른 q, r(q ≠ r)이라면 q × r점을 얻습니다.
       네 주사위에 적힌 숫자가 모두 다르다면 나온 숫자 중 가장 작은 숫자 만큼의 점수를 얻습니다.*/

    public static int solution(int a, int b, int c, int d) {
        int answer = 0;

        if ((a==b) && (c==d) && (b==d)) { // 다 같은 경우
            answer = 1111 * a;
        } else if (a==b && b==c && a!=d) {
            answer = (10 * a + d) * (10 * a + d);
        } else if (b==c && c==d && b!=a) {
            answer = (10 * b + a) * (10 * b + a);
        } else if (c==d && d==a && c!=b) {
            answer = (10 * c + b) * (10 * c + b);
        } else if (d==a && a==b && d!=c) {
            answer = (10 * d + c) * (10 * d + c);
        } else if (a==b && c==d) {
            answer = a>c ? (a+c) * (a-c) : (a+c) * (c-a);
        } else if (b==c && a==d) {
            answer = b>d ? (b+d) * (b-d) : (b+d) * (d-b);
        } else if (a==c && b==d) {
            answer = a>b ? (a+b) * (a-b) : (a+b) * (b-a);
        } else if (a==b) {
            answer = c * d;
        } else if (a==c) {
            answer = b * d;
        } else if (b==c) {
            answer = a * d;
        } else if (c==d) {
            answer = a * b;
        } else if (d==a) {
            answer = b * c;
        } else if (b==d) {
            answer = a * c;
        } else {
            // 제일 작은 경우의 수
            if (a < b) {
                // b는 답이 될 수 없음
                if (a < c) {
                    if (a < d) answer = a;
                    else if (c < d) answer = c;
                    else answer = d;
                } else { // a는 이미 걸러짐
                    if (c < d) answer = c;
                    else answer = d;
                }
            } else { // b가 a보다 작음
                if (b < c) {
                    if (b < d) answer = b;
                    else if (c < d) answer = c;
                    else answer = d;
                } else {
                    // b는 이미 걸러짐
                    if (c < d) answer = c;
                    else answer = d;
                }
            }
        }
        return answer;
    }

    public static int solution2(int a, int b, int c, int d) {
        int[] dice = { a, b, c, d };
        // 배열에 넣고 배열을 정렬한다
        Arrays.sort(dice);

        // ans는 0으로 초기화
        int ans = 0;

        // 만약 0번째와 마지막 3번째 원소 값이 같다면 원소들이 다 같은 값이므로
        // a == b == c == d
        if (dice[0] == dice[3]) {
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) { // 0, 1, 2 or 1, 2, 3
            // Math.pow() - 거듭제곱을 구하는 함수
            // 둘을 더해서 겹칠 1을 빼버림 - 이렇게 되면 조건문을 따로 써주지 않아도 됨
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            // 두 개씩 같은 경우 - (p * q) * |p-q| -> 이미 정렬 완료라 3에서 1 빼면 됨
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) {
            // 0, 1 만 같은 경우
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) {
            // 1, 2 만 같은 경우
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) {
            // 2, 3만 같은 경우
            ans = dice[0] * dice[1];
        } else {
            // 다 해당되지 않는다면 제일 작은 원소를 return
            ans = dice[0];
        }

        return ans;
    }

    public static int solution3(int a, int b, int c, int d) {
        int [] array = {a, b, c, d};
        // 정렬을 먼저 하고
        Arrays.sort(array);

        int answer = 0;

        if (array[0] == array[3]) {
            // 네 개가 모두 같은 경우
            answer = 1111 * array[0];
        } else if (array[0] == array[2] || array[1] == array[3]) {
            // 세 개가 같은 경우
            answer = (int) Math.pow((10 * array[1] + (array[0] + array[3] - array[1])) ,2);
        } else if (array[0] == array[1] && array[2] == array[3]) {
            answer = (array[0] + array[3]) * (array[3] - array[0]);
        } else if (array[0] == array[1]) {
            answer = array[2] * array[3];
        } else if (array[1] ==  array[2]) {
            answer = array[0] * array[3];
        } else if (array[2] == array[3]) {
            answer = array[0] * array[1];
        } else {
            answer = array[0];
        }

        return answer;

    }
    public static void main(String[] args) {
        int ans = solution3(2,2,2,3);
        System.out.println(ans);
    }
}
