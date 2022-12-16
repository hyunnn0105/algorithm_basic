package Baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj2675_문자열반복 {

    public static void main(String[] args) throws IOException {

        /*
        문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
        즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
        QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalNum = Integer.parseInt(br.readLine());

        // 입벽받는 반복문
        for (int i = 0; i < totalNum; i++) {

            String[] str = br.readLine().split(" ");
            int loopNum = Integer.parseInt(str[0]);
            String s = str[1];

            // 문자열 분리 반목문
            for (int j = 0; j < s.length() ; j++) {
                //문자열 반목 반목문
                for (int k = 0; k < loopNum; k++) {
                    System.out.print(s.charAt(j));
                }

            }
            System.out.println();

        }



    }


}
