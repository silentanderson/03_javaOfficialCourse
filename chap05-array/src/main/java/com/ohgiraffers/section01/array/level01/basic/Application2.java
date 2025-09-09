package com.ohgiraffers.section01.array.level01.basic;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        String[] arrayFruits = new String[] {"딸기", "바나나", "복숭아", "키위", "사과"};  // 과일 어레이
        int idx;    //  입력받을 정수
        String resultFruit;

        System.out.print("0부터 4까지의 정수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        idx = sc.nextInt();

        if (idx >= 0 && idx <= 4) {   // 범위 안으로 제대로 입력한 경우
            resultFruit = arrayFruits[idx];
            System.out.println(resultFruit);
        } else {     // 범위 밖의 수를 입력한 경우
            System.out.println("준비된 과일이 없습니다.");
        }

    }
}
