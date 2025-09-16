package com.ohgiraffers.section01.list;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* 사용자 정의 자료형으로 ArrayList 생성하고 정렬하기 */
        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1,"홍길동전","허균",50000));
        bookList.add(new BookDTO(2,"목민심서","정약용",30000));
        bookList.add(new BookDTO(3,"동의보감","허준",40000));
        bookList.add(new BookDTO(4,"삼국사기","김부식",46000));
        bookList.add(new BookDTO(5,"삼국유사","일연",58000));

        // 출력
        System.out.println("==== 정렬전 ====");
        for (BookDTO book:bookList) {
            System.out.println(book);
        }

        // 정렬
        Collections.sort(bookList);
        System.out.println("==== 제목 오름차순 정렬 후 ====");
        for (BookDTO book:bookList) {
            System.out.println(book.toString());
        }

        /* 정렬 기준을 한번만 사용하는 경우 */

    }
}
