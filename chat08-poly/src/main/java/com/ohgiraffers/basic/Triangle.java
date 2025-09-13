package com.ohgiraffers.basic;

public class Triangle extends Shape implements Resizable {

    /*
    - Triangle 속성
    - base(밑변)
    - height(높이)
    - side1(첫 번째 변)
    - side2(두 번째 변)
    - side3(세 번째 변)
     */
    double base;
    double height;
    double side1;
    double side2;
    double side3;

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void resize(double factor) {
        base *= factor;
        height *= factor;
        side1 *= factor;
        side2 *= factor;
        side3 *= factor;
    }

    @Override
    double calculateArea() {
        return ((1.0/2) * base * height);
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
