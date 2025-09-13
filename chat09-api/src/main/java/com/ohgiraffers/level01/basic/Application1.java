package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");

        String sentenceIn = sc.nextLine();
        //System.out.println(sentenceIn);
        String[] wordArr = sentenceIn.split(" ");

        StringBuilder sentenceResult = new StringBuilder();
        int countWord = 0;

        // 띄워쓰기 이후에 먼저나오는 문자는 대문자로 변환한다.
        for (int i=0; i<wordArr.length; i++) {
            String tmpWord = wordArr[i];

            char[] tmpCharArr = tmpWord.toCharArray();   // 단어의 문자열 배열
            char tmpCharFirst = tmpCharArr[0];    // 끊은 단어들의 첫글자

            // 첫글자가 대문자이면 넘어가고 소문자이면 변환
            char tmpCharFirstChanged;
            if (tmpCharFirst >= 65 && tmpCharFirst <= 90) {   // 대문자이면
                tmpCharFirstChanged = tmpCharFirst;
            } else {    //  소문자 이면 변환하기
                tmpCharFirstChanged = (char) (tmpCharFirst - 32);
            }
            tmpCharArr[0] = tmpCharFirstChanged;    // 대문자 변환

            String tmpWordResult = new String(tmpCharArr);

            if (i < wordArr.length) {
                sentenceResult.append(tmpWordResult + " ");
            } else {
                sentenceResult.append(tmpWordResult);
            }

            countWord++;
        }

        System.out.println("반환된 문자열: " + sentenceResult);
        System.out.println("총 단어 개수 : " + countWord);

    }
}