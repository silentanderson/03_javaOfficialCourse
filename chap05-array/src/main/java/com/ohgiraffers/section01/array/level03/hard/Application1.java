package com.ohgiraffers.section01.array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        // 필요 변수 선언
        int numIn;          // 입력받은 정수
        Scanner sc = new Scanner(System.in);    //  스캐너 객체
        int[] numOutArray;      //  출력할 정수형 배열
        int tmpVal = 0;

        // 입력 받기 시작
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        numIn = sc.nextInt();
        // numOutArray = new int[numIn];

        // (홀수 & 양수) 판단 알고리즘
        if ((numIn % 2 == 1) && (numIn > 0)) {   // 홀수이면서 양수인 입력 정수
            for (int i=0; i<numIn; i++) {
                if (i <= numIn/2) {
                    tmpVal++;     // 중간지점 오기전까지는 +1
                } else {
                    tmpVal--;     // 중간지점 넘어서부터는 -1
                }
                System.out.print(tmpVal);    // 값 출력
                if (i != (numIn-1)) {
                    System.out.print(" ");    // 중간 공백 출력
                }
            }
        } else {
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }

    }
}
