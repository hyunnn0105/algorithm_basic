package Baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

// 긴자리 계산
// https://www.acmicpc.net/problem/2338

public class Bj2338_긴자리계산 {
    public static void main(String[] args) throws IOException {


        // 음수도 들어올 수 있음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());

        // 1. a+b
        System.out.println(a.add(b));
        // 2. a-b
        System.out.println(a.subtract(b));
        // 3. a*b
        System.out.println(a.multiply(b));
    }
}
