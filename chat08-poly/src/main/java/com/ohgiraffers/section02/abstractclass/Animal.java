package com.ohgiraffers.section02.abstractclass;

public abstract class Animal {
    String name;

    // 생성자
    public Animal(String name) {
        this.name = name;
    }
    // 일반 메서드
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // 추상 메서드 (구현은 하위 클래스에서 반드시 해야 함)
    public abstract void makeSound();
}
