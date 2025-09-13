package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String sentenceIn = sc.nextLine();  // 문장 입력 받기

        System.out.println(sentenceIn);

        // 나의 전략 = 대문자든 소문자든 소문자로 맞춰 수정해놓고 비교해서 동일한거 카운트 하기



    }
}
