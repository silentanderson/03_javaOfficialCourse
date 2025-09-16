package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        /* 비교 대상 두 인스턴스의 price 가 오름차순 정렬 되기 위해서는  */
        return o1.getPrice() - o2.getPrice();
    }
}
