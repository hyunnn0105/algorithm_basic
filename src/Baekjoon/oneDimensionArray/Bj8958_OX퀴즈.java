package Baekjoon.oneDimensionArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bj8958_OX퀴즈 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(br.readLine());

        // 입력을 loop 갯수 만큼 받기
        for (int i = 0; i < loop; i++) {
            String OX = br.readLine();
            // System.out.println(OX);
            int sum = 0;
            // 점수 계산하기
            // O가 연속될때는 연속된 O의 갯수 X를 만나는 순간 끝
            // OX 갯수 분리한 다음 더해주기??
            int number = 0;
            for (int j = 0; j < OX.length(); j++) {

                if (OX.charAt(j) == 'O'){
                    // System.out.println("OX.charAt(j) : " + OX.charAt(j));
                    /*
                    // O이 앞에있으면 number에 +1 해서 답을 구하고 싶음
                    if (j != 0 && OX.charAt(j-1) == 'O'){
                        number = number + 1;
                    }

                     */

                    // System.out.println("number : " + number);
                    // number 선언위치 while 밖으로 빼주기
                    // 연산자의 우선순위 생각해서 number 위치 바꿔주기
                    number = number + 1;
                    sum += number;


                } else {
                    // System.out.println("OX.charAt(j) : " + OX.charAt(j));
                    // System.out.println("number : " + number);
                    number = 0;
                }
            }
            System.out.println(sum);
            
            
        }
    }

}
