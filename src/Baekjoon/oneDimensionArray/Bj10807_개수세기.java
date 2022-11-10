package Baekjoon.oneDimensionArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj10807_개수세기 {
    // 1차원 배열
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 정수의 갯수
        int arraySize = Integer.parseInt(br.readLine());
        int[] numberArray = new int[arraySize];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        // int i = 0;
        // 정수가 공백으로 구분
        for (int j = 0; j < arraySize; j++) {
            String token = st.nextToken();
            numberArray[j] = Integer.parseInt(token);
        }
//        while (st.hasMoreTokens()) {
//             numberArray[i] = Integer.parseInt(st.nextToken());
////            System.out.println(Integer.parseInt(st.nextToken()));
//            i++;
//        }
        // NumberFormatException
        // 찾으려고하는 정수 V
//        System.out.println(Arrays.toString(numberArray));
        int v = Integer.parseInt(br.readLine());
        int findTotal = 0;
        for (int l = 0; l < arraySize; l++) {
            if (numberArray[l] == v){
                findTotal++;
            }
        }
        System.out.println(findTotal);
    }

}
