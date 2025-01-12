package org.example;

public class SubjectScore {

    String subject;
    int score;

    public static void main(String[] args) {
        SubjectScore s1 = new SubjectScore();
        s1.subject = "국어";
        s1.score = 30;

        SubjectScore s2 = new SubjectScore();
        s2.subject = "영어";
        s2.score = 60;

        SubjectScore s3 = new SubjectScore();
        s3.subject = "수학";
        s3.score = 40;

        //SubjectScore타입 배열의 리모컨들이니까 int[] 대신 SubjectScore[]
        SubjectScore[] arr = {s1, s2, s3};
        System.out.println(arr[0].subject + "의 점수는 " + arr[0].score);
        System.out.println(arr[1].subject + "의 점수는 " + arr[1].score);
        System.out.println(arr[2].subject + "의 점수는 " + arr[2].score);


    }
}
