package com.study.seven;

public class Q32 {

    /**
     * 문제 설명
     * 머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다. 양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다. 정수 n과 k가 매개변수로 주어졌을 때, 양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.
     *
     * 제한사항
     * 0 < n < 1,000
     * n / 10 ≤ k < 1,000
     * 서비스로 받은 음료수는 모두 마십니다.
     */

    // 내 풀이
    public int solution(int n, int k) {
        int answer = 0;

        answer = (12000 * n) + (2000 * (k-(int)n/10));

        return answer;
    }

    // 다른 사람들의 풀이1
    public int solution2(int n, int k) {
        return n * 12000 + k * 2000 - (n / 10 * 2000);
    }

    // 다른 사람들의 풀이2
    public int solution3(int n, int k) {
        int lambTotalPrice = totalPrice(Menu.LAMB, n);
        int drinkTotalPrice = totalPrice(Menu.DRINK, k);
        int discountPrice = discount(Menu.DRINK, n);

        int totalPay = lambTotalPrice + drinkTotalPrice - discountPrice;
        return totalPay;
    }

    private int totalPrice(Menu menu, int quantity) {
        return menu.getPrice() * quantity;
    }

    private int discount(Menu menu, int lambQuantity) {
        // 양꼬치 10인분에 음료수 하나
        int point = lambQuantity / 10;

        return menu.getPrice() * point;
    }
}

enum Menu {

    LAMB("양꼬치", 12000),
    DRINK("음료수", 2000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
