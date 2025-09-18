package com.ohgiraffers.section.functionalinterface;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import java.util.function.*;

public class Application1 {
    public static void main(String[] args) {
        // 표준 함수적 인터페이스 중 consumer 에 대해 이해하고 사용할 수 있다.
        // Consumer : 리턴값이 없는 accept() 메소드를 가지고 있다.

        // 1. Consumer
        Consumer<String> consumer = str -> System.out.println(str + "이(가) 입력됨");
        consumer.accept("hello world");

        // 2. BiConsumer
        BiConsumer<String, LocalTime> biConsumer = (str1, time) -> System.out.println(str1 + "이(가) " + time + "에 입력됨");
        biConsumer.accept("hello world", LocalTime.now());

        // 3. IntConsumer
        IntConsumer intConsumer = num -> System.out.println("입력하신 정수의 제곱은 " + (num * num) + "입니다.");
        intConsumer.accept(15);

        // 4. LongConsumer
        LongConsumer longConsumer = num -> System.out.println("입력하신 정수는 " + num + "입니다.");
        longConsumer.accept(12345);

        // 5. ObjIntConsumer
        ObjIntConsumer<Random> objIntConsumer =
                (random, bound) -> System.out.println("0 부터 " + bound + "전 까지의 난수 발생 : " + random.nextInt(bound));
        objIntConsumer.accept(new java.util.Random(), 10);

        // 6. ObjLongConsumer
        ObjLongConsumer<LocalDate> objLongConsumer =
                (date, days) -> System.out.println(date + "의 " + days + "일 후의 날짜는 : " + date.plusDays(days));
        objLongConsumer.accept(LocalDate.now(), 10);

        // 7. ObjDoubleConsumer
        ObjDoubleConsumer<StringBuilder> objDoubleConsumer =
                (sb, doubleValue) -> System.out.println(sb.append(Math.abs(doubleValue)));
        objDoubleConsumer.accept(new StringBuilder("절대값 : "), -123.5);
    }
}
