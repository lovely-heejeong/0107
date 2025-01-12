package org.example;

import java.util.Arrays;

public class MultiEx {

    public static void main(String[] args) {

 //       int[][] arr = { {1,3}, {2,4}, {3,4}, {6,6} };
 //       System.out.println(arr);
 //       System.out.println(arr[0]); //배열의 리모컨을 가짐
 //       System.out.println(arr[1][1]); // 점프 2번 => 결과는 4

 //       int[] temp = arr[1];

        //int 배열을 담는 (4byte 공간)6칸 짜리 배열
        //[6]뒤의 []는 내용물을 지정하지 않았으니까 빈껍데기 리모컨 => null
        int[][] arr = new int [6][];
        System.out.println(Arrays.toString(arr)); //결과는 null

        //arr의 내용물은 int 배열의 리모컨만 담을 수 있음
        int[] temp1 = {1,2,3};
        System.out.println(temp1);

        arr[0] = temp1;
        System.out.println(arr[0] == temp1); //결과는 true



    }
}
