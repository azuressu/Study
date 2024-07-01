package com.study.jck;

class Tomato {
    public int st(int a, int b) {
        System.out.print(a+b);
        return a-b;
    }
}

class Apple extends Tomato {
    public int st(int a, int b) {
        System.out.print(a-b);
        return a+b;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Tomato t = new Apple();
        int a=5, b=3;
        System.out.println(t.st(a,b));
    }
}
