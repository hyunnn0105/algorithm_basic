package Baekjoon.oneDimensionArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bj1546_평균 {

    public static void main(String[] args) throws IOException {
        // 자기 점수의 최댓값 = M
        // 모든 점수를 점수/M*100으로 고침

        // 1. 입력받은 수 중에 최고점
        // 2. 점수/최고점수(M)*100 계산하기 ...?????
        // 3. 전체 평균 내기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subject = Integer.parseInt(br.readLine());
        int[] subArr = new int[subject];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 배열에서 최댓값 구하기
        // 임의의 max 값 지정 후 더 큰 수 있으면 변경해주기
        int highNum = subArr[0];
        for (int i = 0; i < subArr.length; i++) {
            subArr[i] = Integer.parseInt(st.nextToken());
            if (subArr[i]>highNum){
                highNum = subArr[i];
            }
        }
//        System.out.println(Arrays.toString(subArr));
        double sum = 0;
        for (int i = 0; i < subArr.length; i++) {
            double cal = (double) subArr[i]/highNum;
//            System.out.println("cal : " + cal);
            sum = sum + (cal * 100);
//            System.out.println("sum : " + sum);
        }
//        System.out.println(40%80);
        System.out.println(sum/subArr.length);

    }
}
