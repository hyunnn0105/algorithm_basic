package something;

import java.util.Scanner;

public class S_평점계산기 {
    public static void main(String[] args) {

        // 심사위원 10명 -> 0 ~100 = 배열 A
        // 최저점수 제외, 최고점수 제외 ==> 평균

        // int[] A = {50,50,10,50,50,100,50,50,50,50};
        int[] A = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        // 대소 비교
        int max = 0;
        int mini = 100;
        int maxIndex = 0;
        int miniIndex = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i] > max){
                max = A[i];
                maxIndex = i;
                System.out.println("max - " + A[i]);
            } else if (A[i] < mini) {
                mini = A[i];
                miniIndex = i;
                System.out.println("mini - " + A[i]);
            }


        }

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (i != 5 && i != 2){
                sum += A[i];
            }

        }
        sum = sum/ (A.length-2);



        // System.out.println(max);
        // System.out.println(maxIndex);
        // System.out.println(mini);
        // System.out.println(miniIndex);

        System.out.println("sum : " + sum);

    }
}
