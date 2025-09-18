package com.ohgiraffers.practice.basic;

import java.util.*;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 학생들의 ID를 관리하는 프로그램을 작성하세요. 이미 존재하는 ID는 추가하지 않으며, 전체 학생 ID를 출력합니다.
         */
        // 중복허용을 하지 않기 때문에, HashSet 적용

        Scanner sc = new Scanner(System.in);
        String inStr;     // 입력 문자열
        HashSet<String> idHashSet = new HashSet<>();

        while(true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            inStr = sc.next();

            if (!inStr.equals("exit")) {     // 정상입력하면
                if (!idHashSet.contains(inStr)) {     // 중복 없으면
                    idHashSet.add(inStr);
                    System.out.println("ID가 추가 되었습니다.");
                } else {     // 중복 있으면
                    System.out.println("이미 등록 된 ID입니다.");
                }
            } else {     // exit 입력이 들어오면
                System.out.println("모든 학생의 ID : " + idHashSet);
                break;
            }
        }
    }
}
