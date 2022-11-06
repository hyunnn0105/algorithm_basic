package Baekjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

public class Bj15552빠른AB {
    public static void main(String[] args) throws IOException {
        // - BufferedReader

        // - BufferedWriter

        // - StringBuilder
        // 1. StringBuffer 멀티쓰레드에 안전하도록 동기화 되어있음
        // -> StringBuffer의 쓰레드 기능을 제외해서 StringBuilder를 생성함
        // 완전히 똑같은 기능이라 StringBuffer 대신 StringBuilder를 사용하도록 바꿔주면 된다


        // 1. 반복 횟수 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // String s = bf.readLine();
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
            // 2. A + B
            // int sum = a + b;
            // System.out.println(sum);
        }
        // BufferedReader 닫아주기 
        br.close();

        // BufferedWriter 닫아주기
        bw.flush();
        bw.close();
        // System.out.println(num);



    }
}
