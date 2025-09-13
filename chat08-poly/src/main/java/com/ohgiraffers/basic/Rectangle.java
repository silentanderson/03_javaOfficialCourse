package com.ohgiraffers.basic;

public class Rectangle extends Shape implements Resizable {

    /*
    - Rectangle 속성
    - width(너비)
    - height(높이)
     */

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2*(width+height);
    }
}
