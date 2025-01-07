package org.example;

public class MinEx {
    public static void main(String[] args) {

        int[] arr = {32,34,22,13,6, -3};

        //유지하는 값
        int min = arr[0];
        int max = arr[0];

        for (int value: arr) {//정수로 구성된 arr의 하나하나의 요소를 꺼내서 반복한다
            System.out.println(value);

      //      삼항연산자 쓰기
      //      min = value < min ? value: min;
      //      max = value > max ? value: max;

            //value값이 min보다 작으면, min값은 value
            if(value < min){
                min = value;
            }
            if (value > max){
                max = value;
            }

        }//for end

        System.out.println("MIN: " + min);
        System.out.println("MAX: " + max);
    }
}
