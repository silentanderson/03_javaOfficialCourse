package com.ohgiraffers.practice.basic;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         *
         * 결과 : 5
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */
        Scanner sc = new Scanner(System.in);
        int boonJa;
        int boonMo;

        try {
            // 사용자 입력받기
            System.out.print("분자 입력 : ");
            boonJa = sc.nextInt();

            System.out.print("분모 입력 : ");
            boonMo = sc.nextInt();

            // 나눗셈 수행
            int result = boonJa / boonMo;
            System.out.println("결과 : " + result);

        } catch (InputMismatchException e) {
            // 정수가 아닌 값을 입력했을 때
            System.out.println("오류 : 유효한 정수를 입력하세요.");
        } catch (ArithmeticException e) {
            // 0으로 나눴을 때
            System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        } finally {
            // 항상 실행되는 부분
            System.out.println("실행이 완료되었습니다.");
        }

        sc.close();
    }
}
