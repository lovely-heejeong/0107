package org.example;

public class ArrayEx {
    public static void main(String[] args) {

        int[] arr = {10,30,24,32,42,15};

        //length = 6
        //인덱스번호 = 0,1,2,3,4,5

        //방법1 - 지정된 횟수
        for (int i = 0; i < arr.length ; i++) {
            //    System.out.println(arr[i]);

            int value = arr[i];
            System.out.println(value);
        }

        System.out.println("------------------------");

        //방법2 - 내용물 출력할 때
        for (int value: arr){
            System.out.println(value);

          }//end for

        }

    }

