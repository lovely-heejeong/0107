package org.example;

import java.util.Arrays;

public class Lotto2 {
    public static void main(String[] args) {

        int[] balls = new int[45];

        //1부터 45까지 채움 (45 or balls.length)
        for (int i = 0; i < 45; i++) {
            balls[i] = i + 1;
        }
        System.out.println(Arrays.toString(balls));


        //임의의 숫자 0부터 44까지 - 6번 뽑기
        for (int i = 0; i < 6;) {

            int idx = (int)(Math.random() * 45); //임의의 배열내 인덱스 번호

            int value = balls[idx]; //내용물
        //    balls[idx] = -1;

            //만일 value == -1이면 continue
            if(value == -1){
                System.out.println("중복 발생");
                continue;
            }

            System.out.println(value);

            //출력한 다음에는 내용물을 -1로 바꾼다.
            balls[idx] = -1;
            i++;


        }//end for

        System.out.println(Arrays.toString(balls));

    }

}
