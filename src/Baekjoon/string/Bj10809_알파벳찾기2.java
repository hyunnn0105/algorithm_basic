package Baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10809_알파벳찾기2 {

    public static void main(String[] args) throws IOException {

        /*
        알파벳 소문자로만 이루어진 단어 S가 주어진다.
        각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

        단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.

        각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
         */


        // 1. 필요한 것
        // 알파벳 위치?
        // 입력받은 알파벳의 위치 바꿔주기 나머지는 -1 배열


        int[] position = new int[26];

        for (int i = 0; i < position.length; i++) {
            position[i] += -1;
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 중복 없이 arr에 들어가는 조건 -1
            if (position[ch - 'a'] == -1 ){
                position[ch - 'a'] =  i;

            }

        }

        for ( int arr : position ) {
            System.out.print(arr + " ");
        }

    }

}
