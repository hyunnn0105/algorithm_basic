package Baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2439_star2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int strnum = Integer.parseInt(br.readLine());
        String star = "*";

        for (int i = 1; i < strnum+1; i++) {
            for (int j =0 ; j < strnum-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
