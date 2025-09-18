package com.ohgiraffers.Section01;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {
        Stream<Integer> stream =
                Stream.iterate(10, x->x*2).limit(10);
        stream.forEach(val -> System.out.println(val + " "));

        /*
         int Stream
         map :
         */

        IntStream intStream = IntStream.range(0,10);
        intStream
                .filter(i->i%2==0)
                .map(i->i*10)
                .forEach(System.out::println);

    }
}
