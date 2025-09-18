package com.ohgiraffers.section02;

import java.time.LocalTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Application1 {
    public static void main(String[] args) {
        /* 표준 함수적 인터페이스 중 Consumer에 대해 이해하고 사용 */

        // 1. Consumer
        Consumer<String> consumer = str -> System.out.println(str + "이(가) 입력됨");
        consumer.accept("hello world");

        /* 2. BiConsumer<T, U>#accept(T t, U u) : void : 객체 T, U를 받아 소비한다. */
        BiConsumer<String, LocalTime> biConsumer = (str1, time) -> System.out.println(str1 + "이(가) " + time + "에 입력됨");
        biConsumer.accept("hello world", LocalTime.now());


    }
}
