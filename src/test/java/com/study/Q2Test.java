package com.study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    private Q2 q2;

    @BeforeEach
    public void setup() {
        q2 = new Q2(); // Q1 클래스의 인스턴스 생성
    }

    @Test
    void test1() {
        String result = q2.solution(new String[]{"a", "b", "c"});
        assert result.equals("abc");
    }

    @Test
    void test2() {
        String result = q2.solution2(new String[]{"a", "b", "c"});
        assert result.equals("abc");
    }

    @Test
    void test3() {
        String result = q2.solution3(new String[]{"a", "b", "c"});
        assert result.equals("abc");
    }


}