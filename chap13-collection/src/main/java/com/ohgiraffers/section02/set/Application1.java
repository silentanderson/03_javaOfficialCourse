package com.ohgiraffers.section02.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {

    public static void main(String[] args) {

        // HashSet 인스턴스 생성
        HashSet<String> hset = new HashSet<>();

        // 다형성 적용하여 상위 인터페이스 타입으로 사용 가능
        Set hset2 = new HashSet();
        Collection hset3 = new HashSet();

        hset.add(new String("java"));
        hset.add(new String("oracle"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));

        // 저장 순서 유지 안됨
        System.out.println("hset : " + hset);

        // 중복 허용 X
        hset.add(new String("java"));

        System.out.println("hset : " + hset);
        System.out.println("저장된 객체수 : " + hset.size());
        System.out.println("포함확인 : " + hset.contains(new String("oracle")));

        // toArray()배열로 바꾸고 for loop 사용
        System.out.println("===== toArray() 변환 =====");
        Object[] arr = hset.toArray();
        for(int i=0; i<arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        // iterator()로 목록 만들어 연속 처리
        System.out.println("===== iterator() 활용 =====");
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
