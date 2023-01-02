package Baekjoon.bronze5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bj10699_오늘날짜 {
    public static void main(String[] args) {

        // 오늘날짜
        // https://www.acmicpc.net/problem/10699


        //format 지정해주기
        SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
        Date date = new Date();
        System.out.println(format.format(date));


    }
}
