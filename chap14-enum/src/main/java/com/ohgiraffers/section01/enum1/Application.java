package com.ohgiraffers.section01.enum1;

public class Application {
    public static void main(String[] args) {
        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW;
        food = Foods.DRINK_RADISH_KIMCHI_LATTE;

        if (food == 0){
            System.out.println("식사 카테고리 - 앙버터 김치찜");
        }

        System.out.println(Foods.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(Foods.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(Foods.MEAL_BUNGEOPPANG_SUSHI);
        System.out.println(Foods.DRINK_RADISH_KIMCHI_LATTE);
        System.out.println(Foods.DRINK_WOOLUCK_SMOOTHIE);
        System.out.println(Foods.DRINK_RAW_CUTTLEFISH_SHAKE);
    }
}
