package Baekjoon.oneDimensionArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Bj5597_과제 {
    public static void main(String[] args) throws IOException {
        // 1. 30번까지의 출석번호가 하나에 한줄씩 28번 입력
        // 2. 출석번호 중복X
        // 3. 미제출 출석번호 출력시 번호순으로
        
        // 1. 배열에 넣어주기?
        // 2. 배열 반복문 돌려서 안낸사람 찾기
        // 3. 안낸사람 번호순으로 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 제출한 출석번호 배열
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 28; i++) {
            integerList.add(Integer.parseInt(br.readLine()));
        }

        // 반복문 안의 반복문?? 어케 풀지??
        // 1~30까지 반복
        List<Integer> no = new ArrayList<>();
        for (int i = 1; i <= 30; i++) {
            if (!integerList.contains(i)){
                no.add(i);
            }
        }

        // 번호순으로 출력하기!
        for (int i = 0; i < no.size(); i++) {
            System.out.println(no.get(i));
        }

    }
}
