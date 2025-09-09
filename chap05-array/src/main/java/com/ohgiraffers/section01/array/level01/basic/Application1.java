package com.ohgiraffers.section01.array.level01.basic;

public class Application1 {
    public static void main(String[] args) {
        int[] arrayInt = new int[10];

        for (int i=0; i<arrayInt.length; i++) {
            arrayInt[i] = i;
            System.out.println(i + " 번째 인덱스에는 " + i);
        }
    }
}
