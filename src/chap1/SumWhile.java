package chap1;

import java.util.Scanner;

public class SumWhile {

    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i <= number; i++) {
            sum += i;
        }

        System.out.println(sum);

    }



}
