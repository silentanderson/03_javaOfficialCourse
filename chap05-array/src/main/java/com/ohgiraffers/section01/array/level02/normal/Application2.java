package com.ohgiraffers.section01.array.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        // 변수 선언
        String idStr;
        String idStrResult = "";
        //char[] idStrArray;

        // 사용자로부터 주민등록번호 입력 받기
        System.out.print("주민등록번호를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        idStr = sc.next();
        //System.out.println(idStr);

        //idStrArray = idStr.toCharArray();
        //System.out.println(idStrArray);

        // * 붙이는 알고리즘
        for (int i=0; i<idStr.length(); i++) {
            if (i < 8) {
                idStrResult+=idStr.charAt(i);
            } else {
                idStrResult+='*';
            }
        }

        // 결과 출력
        System.out.println(idStrResult);
    }
}
