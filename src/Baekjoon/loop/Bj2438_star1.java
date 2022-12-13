package Baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Bj2438_star1 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int strnum = Integer.parseInt(br.readLine());

        String star = "*";
        String total = "";
        for (int i = 0; i < strnum; i++) {
            total += star;
            System.out.println(total);

        }

    }
}
