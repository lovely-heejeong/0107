package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class GradeEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            System.out.println("성적 점수를 넣어주세요.");
            int userInput = scanner.nextInt();
            grades[i] = userInput; //루프를 돌면서 배열 안의 데이터를 채움
        }//end for

        System.out.println("처리할 점수들은 다음과 같습니다.");
        System.out.println(Arrays.toString(grades));

        //평균 점수 구하기
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }//end for

        //평균은 배열의 모든 내용의 합/데이터 수로 구함
        System.out.println("평균: " + (sum / (float) grades.length));


        //최고 점수 구하기
        //기존 점수보다 큰 경우에 바꿔치기
        int max = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            }//end if

        }//end for

        System.out.println("최고 점수: " + max);

        //최저 점수 구하기
        //최초에 어떤 큰 값을 주고, 그 값보다 작을 때에만 최저 점수를 바꿔치기
        int min = 1000;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < min) {
                min = grades[i];
            }//end if

        }//end for
        System.out.println("최저 점수: " + min);
    }
}