package org.example;

public class NullEx {

    public static void main(String[] args) {

        //앞글자 대문자, 참조 자료형은 null 할당 가능
       String str = null;
       System.out.println(str == null);

 //       System.out.println(str.equals("AAA"));
 //       null point exception 에러는 점프했을 때 발생 => . or [ ] 찾기
 //       가리키는(점프할) 메모리 공간이 없는 빈 리모컨

       int[] arr = new int[3];
       int[] arr2 = arr; //arr + arr2 = 둘다 리모컨이 같은 상자를 가리킴

       arr2 = null; //arr2는 빈 리모컨
       arr = null; //arr도 빈 리모컨 => 레퍼런스 카운트 = 0 => G.C 1순위






    }
}
