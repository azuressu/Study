package com.study;

import com.study.one.Q5;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Q5Test {

    Q5 q5;

    @BeforeEach
    void init() {
        this.q5 = new Q5();
    }

    @Test
    void test1() {
        int result = q5.solution(91, 2);
        assert result == 912;
    }

    @Test
    void test2() {
        int result = q5.solution2(91, 2);
        assert result == 912;
    }

    @Test
    void test3() {
        int result = q5.solution3(91, 2);
        assert result == 912;
    }

}