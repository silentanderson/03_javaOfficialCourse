package com.ohgiraffers.practice.basic;

import java.util.*;

public class Application6 {
    public static void main(String[] args) {
        /*
        이름을 입력하면 전화번호를 검색할 수 있도록 전화번호부를 구현하세요.
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동010-1234-5678
        입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동 010-1234-5678
        추가 완료 : 홍길동 010-1234-5678
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 유관순 010-9876-5432
        추가 완료 : 유관순 010-9876-5432
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
        검색 할 이름 : 유관순
        유관순씨의 전화번호 : 010-9876-5432
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
        검색 할 이름 : 이순신
        이순신씨의 번호는 등록 되어 있지 않습니다.
        이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): exit
         */

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> namePhoneHmap = new HashMap<>();
        String inStr;
        String[] inStrArr;
        String inName;

        // 첫번째 문자 출력
        System.out.println("이름을 입력하면 전화번호를 검색할 수 있도록 전화번호부를 구현하세요.");

        while(true) {
            inStr = "";  // 초기화

            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            inStr = sc.nextLine();
            inStrArr = inStr.split(" ");  // 공백으로 분리

            if (inStrArr.length == 1) {   // 입력문자에 공백이 없으면

                if (inStr.equals("search")) {    // search 입력이 들어오면

                    System.out.print("검색 할 이름 : ");
                    inName = sc.next();

                    if (namePhoneHmap.containsKey(inName)) {    // 검색하는 이름의 키가 존재하면
                        System.out.println(inName + "씨의 전화번호 : " + namePhoneHmap.get(inName));
                    } else {
                        System.out.println(inName + "씨의 번호는 등록 되어 있지 않습니다.");
                    }

                    continue;     // 다음 루프로 넘어간다.

                } else if (inStr.equals("exit")) {    // exit 입력이 들어오면
                    break;

                } else {     //
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                }

            } else {      // 제대로 입력이 들어오면 (입력문자에 공백이 있으면)

                namePhoneHmap.put(inStrArr[0], inStrArr[1]);
                System.out.println("추가 완료 : " + inStr);
            }
        }

    }
}
