package com.ohgiraffers.practice.basic;

import java.util.*;

public class Application2 {
    public static void main(String[] args) {
        /*
        사용자가 방문한 웹사이트 URL을 입력받아 저장하고, 가장 최근에 방문한 5개의 URL을 출력하는 프로그램을 작성하세요.
         */
        /*
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
        최근 방문 url : [https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
        최근 방문 url : [https://github.com/, https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.notion.so/
        최근 방문 url : [https://www.notion.so/, https://github.com/, https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.naver.com/
        최근 방문 url : [https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
        최근 방문 url : [https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
        최근 방문 url : [https://www.google.com/, https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/]
        방문 URL을 입력하세요 (단, exit를 입력하면 종료) : exit
         */

        // Stack 구조를 사용해보자.
        Scanner sc = new Scanner(System.in);
        Queue<String> urlQueue = new LinkedList<>();
        String inURL;
        //Boolean flag = true;

        while(true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            inURL = sc.next();

            if (inURL == "exit") {     // exit 프로그램 탈출
                break;
            } else {     // 정상적인 URL 이 입력값을 들어오면
                // 값을 하나씩 스택에 쌓아올린다.
                urlQueue.offer(inURL);

                // 최근 5개의 url 을 출력한다.
                if (urlQueue.size() <= 5) {   // 5개까지는 그냥 출력
                    System.out.println("최근 방문 url : " + urlQueue);
                } else {    // 5개를 넘어서면
                    urlQueue.poll();   // 가장 먼저 들어온거 제거
                    System.out.println("최근 방문 url : " + urlQueue);
                }
            }
        }






    }
}
