package chap1;

import java.util.Scanner;

public class page2loop {
    // 01 - 2 반복문
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구하시오");
        System.out.print("n : ");
        int n = sc.nextInt();

        int sum = 0;

        // for
        /*
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
         */

        // while
        /*
        int i = 0;
        while (i <= n){
            sum += i;
            i++;
        }
        System.out.println(i);
         */
        for (int i = 1; i <= n; i++){
            int num = 1 + n;
            int division = n/2;
            sum = num * division;
        }
        System.out.println(sum);

    }


}
