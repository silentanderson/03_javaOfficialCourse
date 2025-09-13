package com.ohgiraffers.basic;

public class Circle extends Shape implements Resizable {
    /*
    * ## Shape, Resizable을 상속(구현)하는 Circle, Rectangle, Triangle 클래스 구현

    - Circle 속성
        - radius (반지름)
    * */

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    double calculateArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return 2.0*Math.PI*radius;
    }

}
