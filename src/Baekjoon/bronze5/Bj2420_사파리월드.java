package Baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Bj2420_사파리월드 {
    public static void main(String[] args) throws IOException {
        // 2개의 서브 도매인
        // 유명도가 정소 => 그 차이를 구해라

        // 절댓값 계산
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long n = Integer.parseInt(st.nextToken());
        long m = Integer.parseInt(st.nextToken());
        // BigInteger b = new BigInteger(st.nextToken());
        long sum = n - m;
        // BigInteger sum = a.multiply(b);
        if (sum < 0){
            //sum = sum.multiply(-1);
            sum = sum * -1;
        }
        System.out.println(sum);


    }
}
