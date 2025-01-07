package org.example;

import java.util.Arrays;

public class Lotto1 {
    public static void main(String[] args) {

        //결과물을 담을 배열 선언
        int[] result = new int[6];

        for (int i = 0; i < 6; i++) {
            result[i] = (int) (Math.random() * 45) + 1; //중복 숫자가 나올 수 있음
            System.out.println(result[i]);

        }//end for

        //1-45 랜덤숫자
//        result[0] = (int) (Math.random() * 45) + 1;
//        result[1] = (int) (Math.random() * 45) + 1;
//        result[2] = (int) (Math.random() * 45) + 1;
//        result[3] = (int) (Math.random() * 45) + 1;
//        result[4] = (int) (Math.random() * 45) + 1;
//        result[5] = (int) (Math.random() * 45) + 1;

        //배열의 내용물 확인
        System.out.println(Arrays.toString(result));




    }
}
