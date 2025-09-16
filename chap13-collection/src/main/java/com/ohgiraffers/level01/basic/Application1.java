package com.ohgiraffers.level01.basic;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /*
        학생 성적 : 100
        추가 입력하려면 y : y
        학생 성적 : 95
        추가 입력하려면 y : Y
        학생 성적 : 66
        추가 입력하려면 y : y
        학생 성적 : 79
        추가 입력하려면 y : n
        학생 인원 : 4
        평균 점수 : 85.0
         */

        // ArrayList 를 사용해서 구현해보자.
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        List<Integer> arrList = new ArrayList<>();
        double avgResult=0;

        while(flag) {

            System.out.print("학생 성적 : ");
            int inScore = sc.nextInt();

            System.out.print("추가 입력하려면 y : ");
            String inAnswer = sc.next();

            if (inAnswer.length() != 1) {   // 실수로 대답을 길게 입력했을 때
                System.out.println("잘못 입력하셨습니다.");
                continue;
            } else {    // 'y' or 'n' 으로 제대로 입력했을 때

                // ArrayList 에 하나씩 쌓고 평균계산
                arrList.add(inScore);
                //System.out.println(inScore);
                //avgResult = Math.ceil(calculateAvg(arrList));
                avgResult = arrList.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);  //
                if (inAnswer.charAt(0) == 'n') {   // 'n' 인 경우 while 문 빠져나가기
                    // 'n' 을 입력받을 때 끝내기
                    System.out.println("평균 점수 : " + avgResult);
                    flag = false;
                } else {     // 'y' 인 경우 while 루프 계속
                    flag = true;
                }
            }

        }
    }
    /*
    public static double calculateAvg(List<Integer> arrList) {
        double sum=0;
        for (Integer tmp:arrList) {
            sum += tmp;
        }

        return (double) sum / arrList.size();
    }

     */

}
