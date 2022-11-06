package Baekjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

public class Bj1110_더하기사이클 {

    public static void main(String[] args) throws IOException {

        // 입력 빠르게 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 선언
        String s = br.readLine();
        // 입력받는 수
        int num = Integer.parseInt(s);

        // 새로운 수 저장
        int newNum = 0;
        
        // 반복횟수 저장
        int loop = 0;
        int sum = 0;
        // 주어진 수와 새로운 수의 숫자가 동일한경우 반복문 탈출
        while(newNum != num){

            String s1;
            if (num < 10){
                sum = 0 + num;
                s1 = Integer.toString(num)+Integer.toString(sum);
                newNum = Integer.parseInt(s1);

            } else {
                // 1. 주어진 수의 가장 오른쪽 자리 수
                int front = num/10;
                int back = num % 10;
                bw.write(Integer.toString(front)+"\n");
                bw.write(Integer.toString(back)+"\n");
                // 2. 합의 가장 오른쪽 자리수
                sum = front+back;
                s1 = Integer.toString(back)+Integer.toString(sum);
                newNum = Integer.parseInt(s1);

            }
            loop++;


        }
        bw.write(Integer.toString(loop));

        bw.flush();
        bw.close();

    }

}
