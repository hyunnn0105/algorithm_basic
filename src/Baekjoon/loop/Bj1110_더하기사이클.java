package Baekjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

public class Bj1110_더하기사이클 {

    public static void main(String[] args) throws IOException {

        // 입력 빠르게 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 선언
        // 입력받는 수
        int num = Integer.parseInt(br.readLine());

        // 새로운 수 저장
        int newNum = num;
        
        // 반복횟수 저장
        int loop = 0;
        int sum = 0;
        String s1;
        // 주어진 수와 새로운 수의 숫자가 동일한경우 반복문 탈출
        while (true){

            // 1. 주어진 수의 가장 오른쪽 자리 수
            int front = newNum/10;
            int back = newNum % 10;


            // 2. 합의 가장 오른쪽 자리수
            sum = (front+back) % 10;
            s1 = Integer.toString(back) + Integer.toString(sum);
            newNum = Integer.parseInt(s1);
            loop++;
            if (newNum==num){
                break;
            }

        }
        System.out.println(loop);

    }

}
