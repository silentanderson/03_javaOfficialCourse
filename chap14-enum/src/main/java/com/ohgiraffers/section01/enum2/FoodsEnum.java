package com.ohgiraffers.section01.enum2;

public enum FoodsEnum {
    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),

    DRINK_RADISH_KIMCHI_LATTE(0),
    DRINK_WOOLUCK_SMOOTHIE(1),
    DRINK_RAW_CUttLEFISH_SHAKE(2);

    private final int value;

    FoodsEnum(int value) {
        this.value = value;
    }
}
