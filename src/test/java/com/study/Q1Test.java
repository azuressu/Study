package com.study;

import com.study.one.Q1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Q1Test {

    private Q1 q1;

    @BeforeEach
    public void setup() {
        q1 = new Q1(); // Q1 클래스의 인스턴스 생성
    }

    @Test
    void test1() {
        String result = q1.solution("aaaaa", "bbbbb");
        assert result.equals("ababababab");
    }

    @Test
    void test2() {
        String result = q1.solution2("aaaaa","bbbbb");
        assert result.equals("ababababab");
    }

    @Test
    void test3() {
        String result = q1.solution3("aaaaa","bbbbb");
        assert result.equals("ababababab");
    }

    @Test
    void test4() {
        String result = q1.solution4("aaaaa","bbbbb");
        assert result.equals("ababababab");
    }


}