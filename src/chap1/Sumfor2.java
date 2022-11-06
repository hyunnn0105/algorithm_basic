package chap1;

import java.util.Scanner;

public class Sumfor2 {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int number;

        // 사후판단반복 - 어디서 필요하지?
        do {
            System.out.println("hi");
             number = sc.nextInt();
        } while (number <= 0);

        for (int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);




    }



}
