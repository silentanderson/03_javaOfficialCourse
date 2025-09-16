package com.ohgiraffers.section01.generics;

public class Application {
    public static void main(String[] args) {
        //GenericTest<Integer> gt = new GenericTest<Integer>();

        // Integer 타입
        GenericTest<Integer> gt1 = new GenericTest<>();
        gt1.setValue(10);
        Integer num = gt1.getValue();

        // String 타입
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("hello");
        String str = gt2.getValue();

        // 제너릭 X
        GenericTest gt3 = new GenericTest();
        gt3.setValue(10);
        gt3.setValue("hello");
        String str2 = (String) gt3.getValue();

        System.out.println("1");

    }
}
