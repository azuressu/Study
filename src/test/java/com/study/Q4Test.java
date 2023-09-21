package com.study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q4Test {

    Q4 q4;

    @BeforeEach
    void init() {
        this.q4 = new Q4();
    }

    @Test
    void test1() {
        int result = q4.solution(9, 91);
        assert result == 991;
    }

    @Test
    void test2() {
        int result = q4.solution2(9, 91);
        assert result == 991;
    }

    @Test
    void test3() {
        int result = q4.solution3(9, 91);
        assert result == 991;
    }

}