package com.ohgiraffers.section03.interfaceimplements;

public interface InterProduct {
    /* 인터페이스는 상수 필드만 작성 가능하다.
    * 상수 필드만 가질 수 있기 때문에 묵시적으로 public static final 이다.
    */
    public static final int MAX_NUM = 100;

    /*인터페이스는 생성자를 가질 수 없다.*/

    public abstract void nonStaticMethod();

    /* 추상 메서드만 작성 가능하다.
    묵시적으로 public abstract 의 의미를 가진다.
     */
}
