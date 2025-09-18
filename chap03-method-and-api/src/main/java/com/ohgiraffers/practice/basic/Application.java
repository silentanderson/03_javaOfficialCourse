package com.ohgiraffers.practice.basic;

public class Application {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        //메소드 호출 확인용 메소드 호출
        cal.checkMethod();

        //함수를 호출하여 1~10까지의 합을 리턴 받아 출력
        System.out.println("1부터 10까지의 합 : " + cal.sum1to10());

        //10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
        cal.checkMaxNumber(10, 20);

        //10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
        int aSumTwoNum = 10;
        int bSumToNum = 20;
        System.out.println(aSumTwoNum + "과 " + bSumToNum + "의 합은 : " + cal.sumTwoNumber(10, 20));

        //10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
        int aMinusTwoNum = 10;
        int bMinusTowNum = 5;
        System.out.println(aMinusTwoNum + "과 " + bMinusTowNum + "의 차는 : " + cal.minusTwoNumber(10, 5));
    }
}
