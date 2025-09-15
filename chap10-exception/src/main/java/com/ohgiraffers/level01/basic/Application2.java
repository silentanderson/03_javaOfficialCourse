package com.ohgiraffers.level01.basic;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식 으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */

        Scanner sc = new Scanner(System.in);
        String inString;

        try {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            inString = sc.next();

            LocalDate birthDate = LocalDate.parse(inString); // 입력받은 생일

            LocalDate today = LocalDate.now();   // 오늘 날짜

            int age = Period.between(birthDate, today).getYears();
            System.out.println("나이 : " +  age);
            // 판별
            if (age >= 20) {
                System.out.println("입장하셔도 됩니다.");
            } else {
                System.out.println("만 20세 미만은 입장 불가입니다.");
            }

        } catch (Exception e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } finally {
            sc.close();
        }
    }
}
