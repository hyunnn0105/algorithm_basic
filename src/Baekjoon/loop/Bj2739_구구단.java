package Baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2739_구구단 {
    public static void main(String[] args) throws IOException {

        // n을 입력받은 뒤 구구단 n단을 출력하는 프로그램 작성
        // 1 <= n <= 9

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < 10; i++) {
            int mul = n*i;
            System.out.println( n + " * " + i + " = " + mul);
        }

    }
}
