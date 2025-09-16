package com.ohgiraffers.level01.basic;

import java.util.*;

public class Application5 {
    public static void main(String[] args) {
        /* 사용자가 입력한 단어들을 사전순으로 정렬한 후 출력하는 프로그램을 작성하세요. */
        /*
        단어 입력 ('exit' 입력 시 종료): 안녕
        단어 입력 ('exit' 입력 시 종료): java
        단어 입력 ('exit' 입력 시 종료): collection
        단어 입력 ('exit' 입력 시 종료): 프로그래밍
        단어 입력 ('exit' 입력 시 종료): exit
        정렬 된 단어 : [collection, java, 안녕, 프로그래밍]
         */

        List<String> strArrList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String inStr;

        while(true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            inStr = sc.next();

            if (!inStr.equals("exit")) {
                strArrList.add(inStr);
                Collections.sort(strArrList);    // 쌓고 정렬하고 쌓고 정렬하고
            } else {
                System.out.println("정렬 된 단어 : " + strArrList);
                break;
            }
        }
    }
}
