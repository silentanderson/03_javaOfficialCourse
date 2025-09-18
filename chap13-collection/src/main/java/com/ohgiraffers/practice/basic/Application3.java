package com.ohgiraffers.practice.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        /*
        * 대기 줄을 시뮬레이션하는 프로그램을 작성하세요. 고객이 줄을 서면 대기열에 추가되고, 서비스가 완료되면 대기열에서 제거합니다.
         */

        // 선입선출 -> Queue : LinkedList
        // 변수 입력
        Scanner sc = new Scanner(System.in);
        String inName;
        Queue<String> waitingQueue = new LinkedList<String>();   // 대기자 관리 큐

        while(true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            inName = sc.next();

            if (inName.equals("next")) {   // 대기자 명단에서 빼기
                if (waitingQueue.size() != 0) {   // 대기자 명단이 한명이라도 있으면
                    System.out.println(waitingQueue.peek() + " 고객님 차례입니다.");
                    waitingQueue.poll();
                } else {     // 대기자 명단이 비어있으면
                    System.out.println("대기 고객이 없습니다.");
                }
                continue;
            } else if (inName.equals("exit")) {
                break;
            } else {    // 대기자 명단에 추가하기
                waitingQueue.offer(inName);
                System.out.println(inName + " 고객님 대기 등록 되었습니다.");
            }
        }
    }
}
