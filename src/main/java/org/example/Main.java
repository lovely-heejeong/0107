package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        String s1 = "END";
//        String s2 = new String("END");
//
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));

        //배열 선언
        int[] arr = new int [3]; //메모리의 크기 결정: 음수는 크기가 될 수 없다

        int[] arr2 = arr; //load,copy,store
        System.out.println(arr);
        System.out.println(arr2);
        System.out.println(arr == arr2); //상자의 내용물은 같은 리모컨

        //배열의 접근
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 20;

        //배열의 크기 확인
        System.out.println(arr.length);

        System.out.println(arr[1]);
        System.out.println(arr2[1]);

        //배열의 내용물 보기
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}