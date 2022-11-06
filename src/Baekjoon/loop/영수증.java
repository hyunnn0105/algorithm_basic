package Baekjoon.loop;

import java.util.Scanner;

public class 영수증 {
    public static void main(String[] args) {
        // 구매한 각 물건의 가격과 개수
        // 총 금액

        Scanner sc = new Scanner(System.in);

        int receipt = sc.nextInt();
        int thing = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < thing; i++) {
            int price = sc.nextInt();
            int number = sc.nextInt();
            int cal = price * number;
            sum += cal;
        }
        if (receipt == sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
