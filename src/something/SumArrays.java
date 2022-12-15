package something;

import java.util.Arrays;

public class SumArrays {
    public static void main(String[] args) {

        // 배열 합치기
        // 알파벳 대문자를 담은 무작위 배열 A,B + 각 배열의 길이가 주어짐
        // 합쳐진 새로운 배열 C return

        // a.len이 b.len보다 짧음
        char[] aArr = {'A', 'B', 'C', 'D', 'E'};
        char[] bArr = {'Y', 'X'};

        // a배열의 길이가 길다.
        char[] cArr = new char[aArr.length+ aArr.length];

        for (int i = 0; i < cArr.length; i++) {
            if (i == 0){
                cArr[i] = aArr[i];
            } else if (i%2 == 0) {
                cArr[i] = aArr[i-1];
                System.out.println(Arrays.toString(cArr));
            } else {
                // B의 첫번째 데이터 삽입
                System.out.println(bArr.length);
                for (int j = 0; j < cArr.length/2; j++) {
                    cArr[i] = bArr[j];
                    j++;
                    System.out.println(j);
                    if (j > bArr.length){
                        j--;
                        j--;
                        System.out.println(bArr.length);
                    }
                    break;

                }


            }
            System.out.println(Arrays.toString(cArr));
        }




    }
}
