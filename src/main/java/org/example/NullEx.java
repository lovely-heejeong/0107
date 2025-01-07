package org.example;

public class NullEx {
    public static void main(String[] args) {

       String str = null;
       System.out.println(str == null);

       int[] arr = new int[3];
       int[] arr2 = arr;

       arr2 = null;
       arr = null;

       //null point exception - . or [ ]



    }
}
