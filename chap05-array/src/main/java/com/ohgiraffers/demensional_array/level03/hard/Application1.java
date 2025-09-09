package com.ohgiraffers.demensional_array.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        // variable definition
        int width;
        int height;
        Scanner sc = new Scanner(System.in);
        final char upperA = 'A';
        final char upperZ = 'Z';
        char tmpAlpha;
        int countQuestion = 0;

        // 동작

        do {
            if (countQuestion != 0) {
                System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            }
            System.out.print("가로 행의 수를 입력하세요 : ");
            width = sc.nextInt();

            System.out.print("세로 열의 수를 입력하세요 : ");
            height = sc.nextInt();

            countQuestion++;

        } while(!((width >= 1) && (width <= 10) && (height >= 1) && (height <= 10)));  // while 문 탈출조건

        // 2차원 배열 할당 및 출력
        char[][] arr2D = new char[width][height];
        for (int i=0; i<arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {

                tmpAlpha = (char) (upperA + Math.random() * (upperZ - upperA));   // 랜덤 알파벳 하나를 생성함
                arr2D[i][j] = tmpAlpha;

                if ((j!=0) && (j%(height-1) == 0)) {      // 행 바뀜 조건 거는 부분
                    System.out.println(arr2D[i][j]);
                } else {                         // 행 바뀜 일어나지 않을 경우
                    System.out.print(arr2D[i][j]);
                    System.out.print("  ");
                }
            }
        }
    }
}
