package com.ohgiraffers.practice.basic;

import java.util.*;

public class Application6_1 {
    public static void main(String[] args) {

        // case 1. 정상적인 입력 (띄워쓰기 O)
            // 입력값 hashMap 에 저장
            // continue

        // case 2. 비정상적인 입력 (띄워쓰기 X)
            // 입력이 잘못 되었다고 안내
            // continue

        // case 3. search 입력
            // case 3-1. 검색할 이름 묻기
                // -> 전화번호 띄워주기 or 등록안되어있다고 안내하기

        // case 4. exit 입력 -> 프로그램 끝내기

        Scanner sc = new Scanner(System.in);

        // 입력변수 선언

        String inStr;
        String[] inStrArr = new String[2];
        HashMap<String,String> namePhoneMap = new HashMap<String,String>();
        String inName;

        // Intro 문구 출력
        System.out.println("이름을 입력하면 전화번호를 검색할 수 있도록 전화번호부를 구현하세요.");

        while(true) {

            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit') : ");
            inStr = sc.nextLine();
            inStrArr = inStr.split(" ");

            if ((inStr.contains(" ")) && inStrArr.length == 2) {
                namePhoneMap.put(inStrArr[0],inStrArr[1]);
                System.out.println("추가 완료 : " + inStr);
                continue;
            } else if ((!inStr.contains(" ")) && (!inStr.equals("search")) && !(inStr.equals("exit"))) {
                System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                continue;
            } else if (inStr.equals("search")) {
                System.out.print("검색 할 이름 : ");
                inName = sc.next();
                if (namePhoneMap.containsKey(inName)) {
                    System.out.println(inName + "씨의 전화번호 : " + namePhoneMap.get(inName));
                } else {
                    System.out.println(inName + "씨의 번호는 등록 되어 있지 않습니다.");
                }
                continue;
            } else if (inStr.equals("exit")) {
                break;
            } else {
                System.out.println("입력이 잘못되었습니다. 다시 확인해주세요");
                continue;
            }
        }
    }
}
