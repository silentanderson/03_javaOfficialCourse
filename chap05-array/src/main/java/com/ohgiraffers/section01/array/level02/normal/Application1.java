package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        // 변수 정의
        String strIn;
        char[] carr;
        char charIn;
        int count=0;

        // 문자열 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        strIn = sc.next();     //   입력받은 문자열
        carr = strIn.toCharArray();

        //System.out.println(carr);   for test
        // 검색할 문자 입력 받기
        System.out.print("검색할 문자를 입력하세요 : ");
        charIn = sc.next().charAt(0);

        // System.out.println(charIn);  for test
        // 동일 문자 개수 세기
        for (int i=0; i<carr.length; i++) {
            if (carr[i] == charIn) {
                count++;
            } else {
                continue;
            }
        }
        System.out.println("입력하신 문자열 " + strIn + "에서 찾으시는 문자 " + charIn + "은 " + count + "개 입니다.");
    }
}
