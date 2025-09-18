package com.ohgiraffers.practice.normal;

public class Application2 {
    public static void main(String[] args) {
        // 와일드카드 문제

        Integer[] intArray = {1,2,3,4,5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));

        String[] strArray = {"A", "B", "C"};
        // This line will cause a compile error as intended.
        System.out.println("String 합계 : " + sum(strArray));
    }

    public static <T extends Number> double sum(T[] arr) {
        double result=0.0;
        for (T tmp:arr) {
            result += tmp.doubleValue();     // object 에서 double 을 구할 땐 doubleValue() 메소드 쓰기
        }
        return result;
    }
}
