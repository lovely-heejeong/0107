package org.example;

public class ArrayEx {

    public static void main(String[] args) {

        int[] arr = {10, 30, 24, 32, 42, 15};

        //length = 6
        //인덱스번호 = 0,1,2,3,4,5

        //방법1 - 지정된 횟수
        for (int i = 0; i < arr.length; i++) {

            int value = arr[i];
            System.out.println(value);

     //      System.out.println(arr[i]); // 이렇게 바로 쓸 수도 있음

        }//end for

        //성능이 중요할 때는 이렇게 코드를 짤 수도 있음
        //데이터가 많아질 때 한번만 접근, 처음부터 크기를 결정해서 조건식을 검사할 때

//        int len = arr.length
//        for (int i = 0; i < len ; i++) {
//
//            int value = arr[i];
//            System.out.println(value);


        System.out.println("------------------------");

        //방법2 - 내용물 출력할 때
        //성능이 좋음
        //위와 아래의 코드는 동일한 의미
        for (int value : arr) { //arr에 있는 각각의 내용물을 value라는 이름의 변수로 할거야
            System.out.println(value);

        }

    }
}


