package com.ohgiraffers.section01.list;

import java.sql.Array;
import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        // List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능
        ArrayList alist = new ArrayList();
        List list = new ArrayList();
        Collection clist = new ArrayList();

        alist.add(10);
        alist.add("hello");
        alist.add(new Date());

        List<String> slist = new ArrayList<>();
        slist.add("banana");
        slist.add("mango");
        slist.add("orange");
        slist.add("apple");
        slist.add("grape");

        // List 인터페이스 개수 반환
        System.out.println("slist.size() : " + slist.size());

        /*
        // get(index) 메소드를 통해 저장된 요소 하나를 반환한다.
        for (int i=0; i<slist.size(); i++) {
            System.out.println(slist.get(i));
        }
        */

        // 특정 인덱스에 삽입
        slist.add(1,"mango");
        System.out.println();

        // 특정 인덱스에서 제거
        slist.remove(2);

        // 첫번째 요소 수정
        slist.set(0,"apple");

        // 정렬
        Collections.sort(slist);
        System.out.println("sort : " + slist);

    }
}
