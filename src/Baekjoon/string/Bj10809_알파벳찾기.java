package Baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj10809_알파벳찾기 {
    public static void main(String[] args) throws IOException {
        // 소문자로 이루어진 단어 S
        // 1. 단어에 포함된 경우 -> 처음 등장하는 위치 (첫글자는 0)
        // 2. 단어에 포함 X -> -1 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String smallLetter = br.readLine();

        // 알파벳 소문자 배열
        // -1 이 들어간 배열을 만들어야해서 알파벳 소문자 배열 필요X
        /*
        String fullSmall = "abcdefghijklmnopqrstuwxyz";
        List<Character> alphabatList = new ArrayList<>();
        for (int i = 0; i < fullSmall.length(); i++) {
            alphabatList.add(fullSmall.charAt(i));
        }
        System.out.println("alphabatList : "+ alphabatList);
         */
        int[] arr = new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        /*
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < smallLetter.length(); i++) {
            char c = smallLetter.charAt(i);
            System.out.println(c);
            for (int j = 0; j < alphabatList.size(); j++) {
                if (alphabatList.contains(c)){
                    intList.add(j);
                } else {
                    intList.add(-1);
                }

            }
            System.out.println(intList);
            // 1. 알파벳 순서대로 넣어주기
            // 2. 반복한 숫자대로 넣어주기
        }

        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }

         */
    }
}
