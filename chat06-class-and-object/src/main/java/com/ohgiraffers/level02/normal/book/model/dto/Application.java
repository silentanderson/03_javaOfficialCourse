package com.ohgiraffers.level02.normal.book.model.dto;

public class Application {
    public static void main(String[] args) {

        int d = 10;
        double e = 10.0;

        System.out.println(d == e);

        //기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookDTO1_1 = new BookDTO();
        bookDTO1_1.printInformation();

        //필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO boolDTO2_1 = new BookDTO(null,null,null);
        BookDTO boolDTO2_2 = new BookDTO("자바의 정석","도우출판","남궁성");
        BookDTO boolDTO2_3 = new BookDTO("홍길동전","활빈당","허균");
        boolDTO2_1.printInformation();
        boolDTO2_2.printInformation();
        boolDTO2_3.printInformation();

        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookDTO3_1 = new BookDTO(null, null, null, 0,0.0);
        BookDTO bookDTO3_2 = new BookDTO("자바의 정석","도우출판","남궁성",0,0.0);
        BookDTO bookDTO3_3 = new BookDTO("홍길동전","활빈당","허균", 5000000,0.5);
        bookDTO3_1.printInformation();
        bookDTO3_2.printInformation();
        bookDTO3_3.printInformation();
    }
}
