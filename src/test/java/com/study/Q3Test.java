package com.study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    Q3 q3;

    @BeforeEach
    void init() {
        this.q3 = new Q3();
    }

    @Test
    void test1() {
        String result = q3.solution("love", 10);
        assert result.equals("lovelovelovelovelovelovelovelovelovelove");
    }

    @Test
    void test2() {
        String result = q3.solution2("love", 10);
        assert result.equals("lovelovelovelovelovelovelovelovelovelove");
    }

    @Test
    void test3() {
        String result = q3.solution3("love", 10);
        assert result.equals("lovelovelovelovelovelovelovelovelovelove");
    }
}