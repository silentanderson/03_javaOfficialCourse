package com.ohgiraffers.Section01;

import java.util.*;
import java.util.stream.Stream;

public class Application1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>(Arrays.asList("hello","stream","world"));
        /*
        // 1. Stream 사용 전
        Iterator<String> iterator = stringList.iterator();
        while(iterator.hasNext()){
            String str = iterator.next();

            //System.out.println(str);

            if(str.equals("stream")) {
                System.out.println("걸러낸 값 : " + str);
            }
        }

        // 2. Stream 사용 후
        stringList.stream()
                .filter("stream"::equals)
                .forEach(str -> System.out.println("걸러낸 값 : " + str));

        // 3. 배열 스트림 생성
        String[] strArr = new String[]{"hello","stream","world"};
        Stream<String> stringStream1 = Arrays.stream(strArr);
        Stream<String> stringStream2 = Arrays.stream(strArr,0,2);   // 인덱스 0, 1 출력 (2 제외)

        stringStream1.forEach(str -> System.out.println(str + " "));
        stringStream2.forEach(str -> System.out.println(str + " "));

        // 4. 컬렉션 스트림 생성
        List<String> stringList4 = Arrays.asList("hi", "i'm", "SH");
        Stream<String> stringStream = stringList4.stream();
        Stream<String> parallelStream = stringList4.parallelStream();  // 병렬 처리 스트림

        */
        // 5. Stream Builder
        Stream<String> builderStream =
                Stream.<String>builder()
                        .add("hello")
                        .add("stream")
                        .add("world")
                        .build();
        builderStream.forEach(str -> System.out.println(str + " "));

        System.out.println("1");

    }

    // 5. 비어 있는 스트림
    public Stream<String> streamOf(List<String> list) {
        return list == null || list.isEmpty()
                ? Stream.empty()
                : list.stream();
    }


}
