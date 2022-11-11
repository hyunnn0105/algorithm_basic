package Baekjoon.oneDimensionArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Bj3053_나머지 {
    public static void main(String[] args) throws IOException {
        
        // A%B = A/B의 나머지
        // 1. 수 10개를 입력
        // 2. 이를 42로 나눈 나머지를 구함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> InputInt = new ArrayList<>();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int left = Integer.parseInt(br.readLine());
            arr[i] = left%42;

        }
        // System.out.println(Arrays.toString(arr));

        // 3. 나머지중에 서로 다른 값의 갯수 파악하기
        // 3-1. 서로 다른 값 판단하기?
        for (int i = 0; i < arr.length; i++) {
            // 1. 리스트에서 certain한 다음에 배열 반복문 돌리고 하나 찾기?
            if (!InputInt.contains(arr[i])){
                InputInt.add(arr[i]);
            }

        }
        // 3-2. 동일하면 빼고 다르면 넣기
        System.out.println(InputInt.size());
    }
}
