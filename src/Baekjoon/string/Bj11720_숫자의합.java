package Baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj11720_숫자의합 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        int sum = 0;

        // br.readLine().getBytes() = 문자열에 대하여 해당 문자열을 하나의 byte로 변환해줌
        // getBytes()는 문자열을 byte 배열로 변환함 -> forEach 구문 사용해서 한줄씩 읽어주기
        for (byte value : br.readLine().getBytes()) {
            sum += (value - '0');
        }

        System.out.println(sum);



    }
}
