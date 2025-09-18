package com.ohgiraffers.section01.enum2;

public class EnumEx {
    private static final int MEAL_AN_BUTTER_KIMCHI_STEW = 0;
    private static final int DRINK_RADISH_KIMCHI_LATTE = 0;

    public static void main(String[] args) {

        //boolean isTrue = enumTest(MEAL_AN_BUTTER_KIMCHI_STEW, DRINK_RADISH_KIMCHI_LATTE);     // 컴파일 에러 발생
        boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsEnum.DRINK_RADISH_KIMCHI_LATTE);

        System.out.println(isTrue ? "동일한 값" : "다른 값");

    }

    private static boolean enumTest(FoodsEnum foodsEnum1, FoodsEnum foodsEnum2){

        if(foodsEnum1 == foodsEnum2){
            return true;
        }

        return false;

    }
}
