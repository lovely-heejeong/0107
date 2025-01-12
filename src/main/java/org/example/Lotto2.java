package org.example;

import java.util.Arrays;

public class Lotto2 {

    public static void main(String[] args) {

        int[] balls = new int[45];

        //1부터 45까지 채움 (45 or balls.length)
        //인덱스번호 0일때 볼은 1
        for (int i = 0; i < 45; i++) {
            balls[i] = i + 1;
        }
        System.out.println(Arrays.toString(balls));


        //임의의 숫자 0부터 44까지 - 6번 뽑기
        for (int i = 0; i < 6;) {

            //6번 뽑는 동안 인덱스 번호 뽑기
            //임의의 배열내 인덱스 번호
            int idx = (int)(Math.random() * 45);

            //배열의 내용물 얻어와서 찍기
            int value = balls[idx];

            //원래 i값이 증가해야 되지만...
            //만일 value == -1이면 다시 뽑아야 되니까 continue, 증감조건은 뒤로 빠짐
            if(value == -1){
                System.out.println("중복 발생");
                continue;
            }

            System.out.println(value);

            //출력한 다음에는 내용물을 -1로 바꿈
            balls[idx] = -1;
            i++;


        }//end for

        System.out.println(Arrays.toString(balls));

    }

}
