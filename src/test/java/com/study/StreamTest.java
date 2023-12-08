package com.study;

import java.util.stream.*;

public class StreamTest {

    public static void main(String[] args) {
        // of() 메소드 : 직접 배열을 만듦
        IntStream.of(1,2,3,4,5).forEach(System.out::print);
        // range() 메소드 : 끝 값을 포함하지 않음
        IntStream.range(0,10).forEach(System.out::println);
        // rangeClosed() 메소드 : 끝 값을 포함함
        IntStream.rangeClosed(0,10).forEach(System.out::println);
        // sum() 메소드 : 합계를 구함
        System.out.println(IntStream.rangeClosed(0,10).sum());
        // average() 메소드 : 평균을 구함 [double 형태로 출력하려면 끝에 orElse()/orElseThrow()를 붙여주자]
        double value = IntStream.rangeClosed(0,10).average().orElse(-1);
        System.out.println(value);

        // max() 메소드 : 최대값을 구함
        System.out.println(IntStream.rangeClosed(0,10).max());

        // min() 메소드 : 최대값을 구함
        System.out.println(IntStream.rangeClosed(0,10).min());

        int max = IntStream.rangeClosed(0,10).max().orElse(-1);
        System.out.println(max);

        System.out.println((int) IntStream.rangeClosed(0,10).min().orElse(-1));
    }

}
