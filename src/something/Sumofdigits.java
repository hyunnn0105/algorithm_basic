package something;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 자릿수 더하기
public class Sumofdigits {

    public static void main(String[] args) throws IOException {

        // 자연수 자릿수의 합
        // 자연수 n이 주어지면
        // n의 각 자릿수의 합 구하기

        // 자료형 변환해서 연산 X

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        while (n > 0){
            answer += n % 10;
            n = n / 10;
        }

        System.out.println(answer);

    }
}
