package Baekjoon.bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj11382_꼬마정민 {
    public static void main(String[] args) throws IOException {

        // 런타임에러?? -> int 범위 초과 , long 써주기


        // A + B + C
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

//        long sum = 0;
//        while (st.hasMoreTokens()){
//            sum += Integer.parseInt(st.nextToken());
//        }
//        System.out.println(sum);
        // 숫자 범위때문에 long으로 바꿔주기
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        System.out.print(A + B + C);
        
    }
}
