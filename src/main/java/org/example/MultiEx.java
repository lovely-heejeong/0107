package org.example;

import java.util.Arrays;

public class MultiEx {
    public static void main(String[] args) {

 //       int[][] arr = { {1,3}, {2,4}, {3,4}, {6,6} };
 //       System.out.println(arr);
 //       System.out.println(arr[0]);//배열의 리모컨을 가짐
 //       System.out.println(arr[1][1]);// 점프 2번: arr[1][1]

  //        int[] temp = arr[1];
        int[][] arr = new int [6][];
        System.out.println(Arrays.toString(arr));

        int[] temp1 = {1,2,3};
        System.out.println(temp1);

        arr[0] = temp1;
        System.out.println(arr[0] == temp1);



    }
}
