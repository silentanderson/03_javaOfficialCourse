package com.ohgiraffers.section01.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        int[] randomArray = new int[4];
        int tmpNum;  // 임시로 생성되는 난수값
        Scanner sc = new Scanner(System.in);

        // 중복없는 난수 생성
        int i=0;
        while(i<randomArray.length) {

            tmpNum = (int) (Math.random()*9);
            if (isSame(randomArray, tmpNum)) {
                continue;      // 중복되는 경우 다음 루프로 넘어가기
            }
            // 중복되지 않는 경우
            randomArray[i] = (char) tmpNum;
            i++;
        }

        // 4자리 정수 입력받아서 Strike, Ball 판단하기
        int countInput=10;       // 입력받는 기회 카운트
        final int numDigit=4;
        int numIn;
        int[] numInArray = new int[numDigit];
        int countS=0;          // 스트라이크 수
        int countB=0;          // 볼 수

        while(countInput > 0) {
            System.out.println(countInput + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            numIn = sc.nextInt();    // 입력받은 숫자값

            // 4자리수 검증
            if (!(numIn >= 1000 && numIn <= 9999)) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            numInArray = numToArray(numIn, numDigit);
            countS = countStrike(randomArray, numInArray);
            countB = countBall(randomArray, numInArray);

            if (countS != 4) {
                System.out.println("아쉽네요 " + countS + " S " + countB + " B 입니다.");
            } else {
                System.out.println("정답입니다.");
            }

            countInput--;
        }
    }

    // 난수의 중복 여부를 판단해주는 메소드 정의
    public static boolean isSame(int[] arr, int tmpNum) {
        for (int i=1; i<arr.length; i++) {
            if (arr[i] == tmpNum) {
                return true;
            }
        }
        return false;
    }

    // 스트라이크 개수를 세주는 메소드 정의
    public static int countStrike(int[] arr1, int[] arr2) {
        int countS=0;
        for (int i=1; i<arr1.length; i++) {
            for (int j=1; j<arr2.length; j++) {
                if ((i == j) && (arr1[i] == arr2[j])) {
                    countS++;
                }
            }
        }
        return countS;
    }

    // 볼 개수를 세주는 메소드 정의
    public static int countBall(int[] arr1, int[] arr2) {
        int countB=0;
        for (int i=1; i<arr1.length; i++) {
            for (int j=1; j<arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    countB++;
                }
            }
        }
        return countB;
    }

    // 입력받은 수를 각자 독립적인 숫자어레이로 나눠담는 메소드 정의
    public static int[] numToArray(int numIn, int numDigit) {

        int[] numArray = new int[numDigit];
        for (int i=numArray.length-1; i>=0; i--) {
            int tmpDigit = numIn % 10;   // 마지막 자리수 획득
            //System.out.println(tmpDigit);
            numArray[i] = tmpDigit;
            numIn /= 10;     // 마지막 자리수 제거
        }
        return numArray;
    }

}