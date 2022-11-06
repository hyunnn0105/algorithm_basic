package Baekjoon.loop;

import java.io.*;
import java.util.StringTokenizer;

public class Bj10951_AB4 {

    public static void main(String[] args) throws IOException {

        //  A B 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // sb = StringBuffer와 유사 but 멀티쓰레드X
        StringBuilder sb = new StringBuilder();

        // st = 문자열 분리를 위해 사용
        StringTokenizer st;
        String str;
        // 반복 횟수 없나?
        // 아 반복 조건이 있던거구나,,,
        while ((str = br.readLine())!= null){
            st = new StringTokenizer(str, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // append == 문자열 결합하기
            sb.append(a+b).append("\n");
        }
        br.close();
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();

        // 두 정수는 공백으로 나뉘어 구분함
        // 입력의 종료는 더이상 읽을 수 없는 데이터(EOF)가 없을때 종료함
        // BufferdReader로 EOF 처리
        // https://gre-eny.tistory.com/307
    }
}
