package Baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj1157_단어공부 {
    public static void main(String[] args) throws IOException {

        /*

        [ ====== 메모리 초과 ======]
        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
        단, 대문자와 소문자를 구분하지 않는다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        int[] intArr = new int[26];

        for (int i = 0; i < line.length(); i++) {
            char ch = line.toUpperCase().charAt(i);
            intArr[ch - 'A'] += 1;

        }

        int max = -1;
        char ch = '?';
        for (int i = 0; i < intArr.length; i++) {
            if (max < intArr[i]){
                max = intArr[i];
//                System.out.println("max - " + max);
                // 아스키코드 대문자 출력을 위해 +65
                ch = (char) (i + 65);
            } else if (max == intArr[i]){
                ch = '?';
            }

        }

        System.out.println(ch);

    }
}
