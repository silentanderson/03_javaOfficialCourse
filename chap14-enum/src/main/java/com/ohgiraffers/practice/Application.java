package com.ohgiraffers.practice;

public class Application {
    public static void main(String[] args) {

        // 1. Enum X - 이렇게 하면 컴파일러가 도와줄수 없다.
        OldDirections oldDirection = new OldDirections();
        oldDirection.move(1);   // 1이 뭘 의미하는지 모름
        oldDirection.move(99);    // 99가 아무 의미없지만 에러는 발생하지 않음

        // 2. Enum O
        /* type-safe 하고  */
        OldDirections oldDirection1 = new OldDirections();
        oldDirection1.move(Direction.NORTH.ordinal());

    }
}
