package com.ohgiraffers.section02.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
         * 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
         *
         * A를 3만큼 밀면 D가 되고, z를 1만큼 밀면 a가 됩니다.
         * 또한 공백문자는 변경되지 않습니다.
         *
         * 문자열 1개를 입력 받고, 얼마나 문자를 밀지 알려주는 0보다 큰 정수를 1개 입력 받아
         * 암호문을 작성하는 프로그램을 만들어보세요
         * 단, 숫자가 27인 경우는 1칸을 밀게 됩니다. (알파벳은 26글자 이기 때문)
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : a B z
         * 숫자를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * e F d
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : a B z
         * 숫자를 입력하세요 : 27
         *
         * -- 출력 예시 --
         * b C a
         * */

        // a : 아스키코드 97
        // A : 아스키코드 65

        String strIn;
        int numIn;

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        strIn = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        numIn = sc.nextInt() % 26;

        String result = "";
        int chNum = 0;
        int lowerAlphaA = 97;
        int lowerAlphaZ = 122;
        int upperAlphaA = 65;
        int upperAlphaZ = 90;

        for (int i=0; i<strIn.length(); i++) {
            char chTmp = strIn.charAt(i);
            if (chTmp == ' ') {
                chTmp = ' ';
            } else {
                chNum = (int) chTmp + numIn;
                if (chNum >= lowerAlphaA && chNum <= lowerAlphaZ) {    // 소문자
                    chTmp = (char) chNum;
                } else if (chNum > lowerAlphaZ) {           // 소문자 넘어가는 경우
                    chTmp = (char) (chNum - lowerAlphaZ + lowerAlphaA - 1);
                } else if (chNum >= upperAlphaA && chNum <= upperAlphaZ) {   // 대문자
                    chTmp = (char) (chNum);
                } else if (chNum > upperAlphaZ) {          // 대문자 넘어가는 경우
                    chTmp = (char) (chNum - upperAlphaZ + upperAlphaA - 1);
                }
            }
            result += chTmp;
        }
        System.out.println(result);
    }
}
